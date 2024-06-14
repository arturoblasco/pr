!!!note "Entrega de actividades"
	Para las actividades a realizar en esta unidad deberás subir a la plataforma **AULES** un documento PDF de nombre **ut00ApellidoNombre** con las capturas de pantalla y explicaciones pertinentes.

## 01. Áreas de un repositorio GIT

En esta primera actividad deberás buscar información y explicar las 3 áreas de un proyecto Git:

- **Directorio de trabajo (*Working director*y)**
- **Área de preparación (*Staging area*)**
- **Repositorio (*Directorio .git*)**

<div style="text-align:center;">
    <img src="../../img/ud00/git-areas.png" alt="git-areas" style="max-width:50%;" />
</div>



<hr />



## 02. Configurar nuestro git

Antes de comenzar a utilizar git, debemos configurarlo con los valores que tendrá a partir de ahora (*nombre, correo electrónico, ...*).

Para ello, establecemos:

- el **nombre** de usuario:

   ````sh
   git config --global user.name "tu_nombre_completo"
   ````

- el **correo** de usuario:

   ````sh
   git config --global user.email "tu_direccion_de_correo_electronico"
   ````

- OPCIONAL: el **coloreado** de la salida:

   ````sh
   git config --global colori.ui auto
   ````

- OPCIONAL: el **estado original en los conflictos**:

   ````sh
   git config --global merge.conflictstyle diff3
   ````

Para mostrar la configuración, que ya hemos establecido:

````sh
git config --list
````

<hr />



## 03. Inicializar repositorio local

En la actividad siguiente, vamos a crear un repositorio local, es decir en nuestro PC personal. 

Luego añadiremos y modificaremos algunos archivos y registraremos los cambios. Trabajaremos desde la terminal de texto.

Seguiremos el siguiente proceso:

### Crear una carpeta para alojar el proyecto. 

Por ejemplo, podemos poner nuestro nombre:

```sh
mkdir pruebas-arturo
```

Y, acto seguido, entrar en dicha carpeta:

~~~sh
cd pruebas-arturo
~~~

Comprobamos que tenemos la carpeta vacía

```sh
ls -la
```

### Incializar el repositorio

Para inicializar el repositorio se debe ejecutar la siguiente orden **dentro de la carpeta**:

```sh
git init
```

Puedes observar por el texto <code>Initializade empty Git repository in ...</code> que se acaba de crear un repositorio local:

<div style="text-align:center;">
    <img src="../../img/ud00/git-init.png" alt="git-init" style="max-width:95%;" />
</div>

### Comprobar que se ha creado una carpeta  `.git`.

Esta es la carpeta donde se registrarán todos los cambios que vayamos realizando.

```sh
ls -la
```

Comprueba el contenido de esta nueva carpeta, ¿por qué **.git** tiene un punto delante?

<hr />



## 04. Crear primer cambio en el repositorio

### Crear/editar un archivo `README.md`

Creamos un fichero (con el editor **nano**, por ejemplo):

```sh
nano README.md
```

<div style="text-align:center;">
    <img src="../../img/ud00/nano-readme.png" alt="nano-readme" style="max-width:95%;" />
</div>

Acto seguido, añadimos a dicho archivo una línea con nuestro *nombre* y *apellidos*. Guardamos archivo (en nano con **Ctrl+X**):

<div style="text-align:center;">
    <img src="../../img/ud00/nano-guardar1.png" alt="nano-guardar1" style="max-width:95%;" />
</div>

Guardar con el mismo nombre (pulsa **INTRO**):

<div style="text-align:center;">
    <img src="../../img/ud00/nano-guardar2.png" alt="nano-guardar2" style="max-width:95%;" />
</div>

### Registrar cambios en el repositorio

Para ello deberemos realizar 2 pasos: 

​	Paso 1. Añadimos al área de preparación con la orden <code>git add nombreFichero</code>:   

```sh
git add README.md
```

!!!note "Pasar varios ficheros a la Staging Area"
	Si existen varios ficheros que queremos pasar preparación podemos ejecutar la orden:
	```sh
	git add .
	```

​	Paso 2. Añadimos al repositorio local con la orden <code>git commit -m "descripción del commit"</code>: 

```sh
git commit -m "inicializar repositorio con README.md"
```
???+question "Repetir los puntos 4.5, 4.6 y 4.7 otras dos veces"
	La primera vez añadimos una segunda línea con la *fecha actual* y luego volvemos a hacer  `git add ...`   y   `git commit ...` correspondientes.
	

	La segunda vez añadimos una tercera línea con el *nombre del IES* y luego volvemos a hacer  `git add ...`   y   `git commit ...` correspondientes.


### Por último ver cambios realizados

Para ver los commit realizados ejecutamos:

```sh
git  log
git  log  --oneline
```

<div style="text-align:center;">
    <img src="../../img/ud00/git-log.png" alt="git-log" style="max-width:80%;" />
</div>

Deberían aparecer 3 commits.

!!!warning " "
	No borrar el repositorio local. Lo volveremos a utilizar en la siguiente actividad.

<hr />



## 05. Revisar commits realizados

!!!note " "
	En esta actividad, haremos uso del comando `git checkout` para movernos por los distintos commits.



Antes de nada comprueba que tienes al menos 3 commits realizados. Para ello ejecuta:

```sh
git  log  --oneline --all
```

- La opción `--oneline`, nos muestra la información de cada commit en una línea.

- La opción `--all`,  nos muestra todos los commits.

Debería aparecerte algo semejante a la siguiente imagen:

<div style="text-align:center;">
    <img src="../../img/ud00/git-log.png" alt="git-log" style="max-width:80%;" />
</div>
- La primera columna es un **hash**, un identificador.

​	Los números no están ordenados. En este ejemplo, el primer commit tiene un hash `5e178c8`. El último commit es el `38428b1`. **Tú deberías tener otros hash distintos**. No te preocupes, es así.

- La segunda columna es el **mensaje** que pusimos cuando se hizo el commit.

- Fíjate también que en el último commit, en el caso de ejemplo `38428b1`, existe un **identificador *HEAD***. Esta es una referencia que apunta al commit en el que estamos situados en el momento actual. Además aparece otro **identificador *master***, que indica en la rama en la que estamos. Por defecto, siempre es master.

​	**El identificador *master* siempre apunta al último commit de la rama**. Sin embargo el identificador *HEAD* podemos moverlo y desplazarmos entre distintos commit y ver cómo estaban los archivos en cada momento. 

Para mover el identificador HEAD utilizamos el comando <code>git checkout *numero_hash*</code>.

Realiza los siguientes pasos y crea las capturas correspondientes:


### Ver el contenido de README.md en commit actual

Para ello:

```sh
cat  README.md
```

Deben aparecer 3 líneas de texto: *tu nombre, la fecha* y *el IES*.


### Moverse al primer commit

Para ello hacemos:

```sh
git  checkout  5e178c8
```

!!!warning " "
	Tú deberás poner el hash que tengas en el primer commit.

Te aparecerá un mensaje que contiene "*Te encuentras en estado 'detached HEAD'*....". Esto indica que la referencia HEAD no está al final de la rama. No te preocupes por ello.

Ahora veamos el contenido del archivo `README.md`, Debe aparecer sólo una línea con tu nombre (el contenido que tenía el archivo en ese commit):

```sh
cat README.md
```

### En qué posición de la rama nos encontramos

Para ello ejecutamos:

```sh
git  log  --oneline --all
```

Debería aparecer algo semejante a la siguiente imagen:

<div style="text-align:center;">
    <img src="../../img/ud00//git-log2.png" alt="/git-log2" style="max-width:80%;" />
</div>

Fíjate dónde apunta la referencia HEAD en este momento. 

!!!warning " "
	Algo que quizás te haya pasado desapercibido pero que es extremadamente **IMPORTANTE** es que cada vez que nos movemos de un commit a otro, el contenido del directorio de trabajo cambia. Esto lo hace git de forma automática.

!!!danger " "
	**NO REALIZAREMOS** ningún cambio a los archivos, sólo vamos a echar un vistazo.


### Moverse al segundo commit

Para ello hacemos:

```sh
git  checkout  15cb
```

!!!warning " "
	En este caso deberás poner el hash que tengas en tu repositorio como segundo commit. No es necesario poner todos los dígitos, podemos acortar el hash. 

Ejecuta:

```sh
cat README.md
```

y haz una captura de pantalla.

Deberían aparecer 2 líneas: *tu nombre* y *la fecha*.


### Volver a mostrar los logs

```sh
git  log  --oneline --all
```

Y comprueba que `HEAD` está en el segundo commit.


### Volver al commit master

Para volver al último commit de la rama master, simplemente hacemos:

```sh
git checkout master
```

Podemos ver que todo está en su sitio haciendo:

```SH
git log  --oneline --all
```

Haz una captura de pantalla.

!!!warning " "
	No borrar el repositorio local. Lo volveremos a utilizar en la siguiente actividad.*

<hr />



## 06. Etiquetar commits y ver diferencias

En esta actividad vamos a ver 3 comandos:

- `git tag`
- `git show` 
- `git diff`

El primer comando (`git tag`) nos permite poner etiquetas a los commits. 

!!!warning " "
	**No se etiquetan todos los commits**, sólo las releases que deseemos.

Los 2 siguientes (`git show` y `git diff`) son para ver los cambios realizados entre distintos commits. Son muy parecidos aunque con pequeñas diferencias.

**Básicamente `git show` nos permite ver los cambios de un commit respecto al anterior, mientras que `git diff` nos permite ver cambios en un rango de commits**.

De todas formas tanto `git show` como `git diff` tienen tantas opciones que aquí sólo nos centraremos en las esenciales.

Empecemos.

### Etiquetar el primer y tercer commits

El primer commit será la versión 1 de nuestro proyecto. La etiqueta será `v1`.

El segundo commit no será etiquetado. 

El tercer commit será la versión 2 de nuestro proyecto. La etiqueta será `v2`.

!!!note " "
	En la captura se muestra un error que más tarde corregiremos en la etiqueta de la v2.
	<div style="text-align:center;"> <img src="../../img/ud00/git-tag.png" alt="git-tag" style="max-width:80%;" /> </div>

Para etiquetar utilizamos el comando

```sh
git  tag  -a  nombre_etiqueta  -m  "Mensaje"   commit_a_etiquetar
```

Por ejemplo, en mi caso:

```sh
git tag  -a v1  -m "Versión 1"  5e17
git tag  -a v2  -m "Versión 2"  3842
```

- La opción `-a` significa annotate.

- La opción `-m` nos permite poner un mensaje.

Finalmente debemos poner el commit al que deseamos aplicar la etiqueta.

Si por cualquier motivo nos equivocamos al crear la etiqueta podemos eliminarla con:

```sh
git tag -d nombre_etiqueta
```

Por ejemplo, en el caso anterior nos hemos equivocado en el mensaje de v2, así que:

<div style="text-align:center;">
    <img src="../../img/ud00/git-tag2.png" alt="git-tag2" style="max-width:80%;" />
</div>

### Usar etiquetas para moverse

Las etiquetas nos permiten referenciar commits de una forma más cómoda que usando el identificador de hash.

Por ejemplo es más cómodo usar:

```sh
git checkout v1
```

que:

```sh
git checkout 8b67
```

Para volver al último commit:

```sh
git checkout master
```

### Examinar cambios de un commit respecto al anterior

<div style="text-align:center;">
    <img src="../../img/ud00/git-log-tags.png" alt="git-log-tags" style="max-width:80%;" />
</div>
Para ver los cambios introducidos respecto al commit anterior hacemos:

```sh
git show
```

En este caso, al coincidir todos los apuntadores  (HEAD, master, v2 y 3842) al mismo sitio, el comando anterior es equivalente a

```sh
git show HEAD
git show master
git show 3842
git show v2
```

<div style="text-align:center;">
    <img src="../../img/ud00/git-show.png" alt="git-show" style="max-width:80%;" />
</div>

Como podemos observar, se añadió una línea, la que contiene el IES.

**Las líneas añadidas aparecen en verde y con un signo `+`**.

**Las líneas eliminadas aparecen en rojo y con un signo `-`** (En este caso sólo hemos realizado operaciones de adición).

Para ver el cambio realizado en el commit segundo respecto al primero:

```sh
git show 15cb
```

Debe aparecer añadida la línea con la fecha.

<div style="text-align:center;">
    <img src="../../img/ud00/git-show2.png" alt="git-show2" style="max-width:80%;" />
</div>

Y para ver el cambio realizado en el commit primero respecto al repositorio vacío:

```sh
git show v1
```

Debe aparecer añadida la línea con el nombre.

<div style="text-align:center;">
    <img src="../../img/ud00/git-show3.png" alt="git-show3" style="max-width:80%;" />
</div>

### Examinar cambios de un commit respecto anteriores

Si deseamos ver todos los cambios realizados a lo largo de varios commits, haremos uso de `git diff`.

La forma de uso es 

```sh
git diff commit1..commit2
```

Por ejemplo, para ver los cambios entre la versión 1 y la versión 2, hacemos

```sh
git diff v1..v2
```

<div style="text-align:center;">
    <img src="../../img/ud00/git-diff.png" alt="git-diff" style="max-width:80%;" />
</div>

Podemos ver que se han añadido 2 líneas desde el commit v1.

Es muy **aconsejable poner primero el commit más antiguo y después el commit más moderno**. Si lo hacemos al contrario, el resultado en lugar de aparecer en color verde aparecerá en color rojo, y su interpretación será más confusa.


### Diferencia entre `git show` y `git diff`

También podemos hacer:

```sh
git show v1..v2
```

Ejecuta dicho comando y haz una captura de pantalla. Explica brevemente la diferencia respecto a `git diff v1..v2`


!!!warning " "
	No borrar el repositorio local. Lo volveremos a utilizar en la siguiente actividad.*

<hr />



## 07. Crear repositorio remoto y subir commits locales

En esta actividad crearemos un repositorio vacío en GitHub y subiremos el contenido de nuestro repositorio local.

### Crear un repositorio totalmente vacío en GitHub

Accedemos a nuestra cuenta de GitHub. 

En la **esquina superior derecha**, pulsamos en el signo **+** y luego en **New repository**

<div style="text-align:center;">
    <img src="../../img/ud00/github-nuevo-repo.png" alt="github-nuevo-repo" style="max-width:75%;" />
</div>

Escogemos el nombre del repositorio. No tiene porqué coincidir con el nombre del repositorio local, aunque es lo aconsejable para no hacernos un lío.

En lugar de *pruebasPROG* pon tu nombre.

<div style="text-align:center;">
    <img src="../../img/ud00/github-nuevo-repo2.png" alt="github-nuevo-repo2" style="max-width:75%;" />
</div>

!!!note " "
	Puedes elegir a tu gusto si el repositorio es público o privado, esto no afectará al resto de secciones.

!!!warning " "
	Es muy importante que **NO INICIALICES EL REPOSITORIO**. Si el repositorio no estuviese vacío podría darnos un conflicto.

En una actividad posterior crearemos conflictos y veremos como resolverlos. Pero en en esta actividad, sólo vamos a trabajar lo básico.

Pulsaremos en **Create Repository** y nos aparecerá una página como la siguiente:

<div style="text-align:center;">
    <img src="../../img/ud00/github-nuevo-repo3.png" alt="github-nuevo-repo3" style="max-width:75%;" />
</div>

Ahí podemos ver la URL del repositorio remoto. Hay 2 formas de acceso:

- **mediante HTTPS**
- **mediante SSH**

!!!note " "
	**Usaremos SSH ya que es más seguro y nos permite utilizar cifrado público-privado** debido a que recientemente github ha deshabilitado el acceso mediante usuario y contraseña.<br />
	En el punto **[0.3 Github: Configuración con clave pública/privada](../ud0004/#configuracion-con-clave-publicaprivada){:target="_blank"}** del temario tienes detallada la configuración y pasos a seguir, si todavia no has configurado tu PC de este modo... **debes hacerlo antes de seguir**.

Más abajo se indican los comandos a ejecutar en nuestro repositorio local. Lo vemos en el siguiente punto. 

Para tu comodidad, no cierres la página. Más adelante volveremos a ella.


### Asociar repositorio local con repositorio remoto

En nuestro repositorio local, para asociarlo con el repositorio remoto, hacemos:

```sh
git remote add origin git@github.com:arturoblasco/pruebasPROG.git
```

Nuestro repositorio remoto será identificado como **origin**. Podemos ponerle otro nombre, pero no debemos. Es una convención ampliamente aceptada poner este nombre al repositorio remoto de GitHub.

Para ver si se ha añadido bien:

```sh
git remote -v
```

<div style="text-align:center;">
    <img src="../../img/ud00/git-remote.png" alt="git-remote" style="max-width:80%;" />
</div>

Deben aparecer 2 entradas, una para bajada (fetch) y otra para subida (push)

!!!note " "
    Si por cualquier motivo nos equivocamos y escribimos mal el nombre o la URL, podemos borrar la asociación con
    ```sh
    git remote remove origin
    ```
    y luego volver a crear la asociación. 


### Subir todos los commits locales al repositorio remoto

Para subir el contenido de nuestro repositorio local al repositorio remoto hacemos:

```sh
git push -u origin master
```

El identificador **origin** es el nombre que dimos a nuestro vínculo. El identificador **master** se refiere a la rama principal.

Es una convención ampliamente seguida, así que respétala.

<div style="text-align:center;">
    <img src="../../img/ud00/git-push1.png" alt="git-push1" style="max-width:80%;" />
</div>

!!!note " "
	Si hemos realizado correctamente la configuración de git en nuestro PC se deberían enviar los cambios de nuestro PC al repositorio remoto sin pedir contraseña ya que estamos usando la llave que tenemos configurada en nuestro sistema.

### Comprobando la subida

Volvemos a la página de GitHub y la actualizamos. Nos aparecerá algo semejante a esto:

<div style="text-align:center;">
    <img src="../../img/ud00/github-repo.png" alt="github-repo" style="max-width:75%;" />
</div>

GitHub ofrece muchas funcionalidades.

Así que nos centraremos ahora mismo en las *releases*. Estas se corresponden con el etiquetado que realizamos en la actividad anterior con `git tag`. 

Teníamos 2 releases, etiquetadas como v1 y v2, pero sin embargo aquí no aparece ninguna.

El motivo, es que debemos subir las etiquetas por separado con el siguiente comando:

```sh
git push --tags
```

Así que ejecutaremos dicho comando desde nuestro repositorio local. Refrescaremos la página. Et voilà ! 

<div style="text-align:center;">
    <img src="../../img/ud00/github-repo2.png" alt="github-repo2" style="max-width:75%;" />
</div>

### Examinando commits y releases en GitHub

**Pulsa en commits** y haz una captura de pantalla. Por tu cuenta puedes examinar cada uno de los commits.

**Pulsa en Tags** y haz una captura de pantalla. Observa que se han creado archivos comprimidos con el código fuente para descargar.

!!!warning " "
	No borrar los repositorio local ni repositorio remoto. Los volveremos a utilizar en la siguiente actividad.*

<hr />



## 08. Deshacer cambios en repositorio local

En esta actividad, veremos qué podemos hacer cuando cometemos errores.

Si realizamos algún cambio y hemos "*metido la pata*", podemos deshacer el "entuerto".

Vamos a verlo de forma práctica haciendo uso del comando  `git reset --hard`

###  Deshacer cambios en el directorio de trabajo

Estando en el último commit de la rama master, modificamos el archivo `README.md`

Vamos a eliminar las 2 últimas líneas.

```sh
nano README.md
```

Editamos. Debe quedar una sola línea con *nuestro nombre*.

Para ver los cambios que hemos introducido ejecutamos:

```sh
git diff HEAD
```

Es decir vamos a ver las diferencias que existen en nuestro directorio de trabajo respecto al commit HEAD, o sea, el último commit confirmado.

!!!note " "
	Si quisiesemos ver las diferencias de nuestro directorio de trabajo respecto al commit de la Versión 1, haríamos `git diff v1`.<br />
	Observa que estamos viendo las diferencias hacia al pasado. Esta forma de uso de git diff es diferente a la que vimos en la última actividad, en la cual veíamos las diferencias hacia el futuro.

<div style="text-align:center;">
    <img src="../../img/ud00/git-diff-head.png" alt="git-diff-head" style="max-width:80%;" />
</div>

Se ve claramente que hemos eliminado las 2 últimas líneas. 

Para volver el estado de este archivo y de CUALQUIER OTRO de nuestro directorio de trabajo que hayamos modificado, ejecutamos:

```sh
git reset --hard
```

<div style="text-align:center;">
    <img src="../../img/ud00/git-reset--hard.png" alt="git-reset--hard" style="max-width:80%;" />
</div>

###  ¿Y para deshacer el área de preparación?

Imaginemos que hemos ido un poco más lejos, y que además de modificar el directorio de trabajo, hemos añadido los cambios al *Staging Area*. Es decir hemos hecho:

```sh
nano README.md
```

Borrado las 2 últimas líneas.

Y luego hemos añadido al área de preparación mediante 

```sh
git add README.md
```

No te preocupes en este caso puede también aplicarse el comando anterior:

```sh
git reset --hard
```

Dicho comando coge el contenido que hay en nuestro commit confirmado y recupera ambos: el directorio de trabajo y el área de preparación.


### ¿Y qué pasa si ya realicé un commit?

Imaginemos que hemos ido todavía un poco más lejos, y que además de modificar el directorio de trabajo y añadir los cambios al Staging Area, hemos realizado un commit. Es decir hemos hecho

```sh
nano README.md
```

Borrado las 2 últimas líneas.

Y luego hemos añadido al área de preparación mediante 

```sh
git add README.md
```

Y además hemos hecho

```sh
git commit -m "Borras líneas de README.md"
```

<div style="text-align:center;">
    <img src="../../img/ud00/git-reset-commit-1.png" alt="git-reset-commit-1" style="max-width:80%;" />
</div>

Pues en este caso también podemos usar el comando `git reset --hard` de la siguiente forma:

```sh
git reset --hard HEAD~1
```

<div style="text-align:center;">
    <img src="../../img/ud00/git-reset-commit-2.png" alt="git-reset-commit-2" style="max-width:80%;" />
</div>

**HEAD~1** significa el commit anterior al actual. Es decir **un commit hacia atrás**.

**HEAD~2** significa **2 commits hacia atrás**. 

**HEAD~n** significa **n commits hacia atrás**, sustituyendo n por un número.

!!!note " "
	Usar `git reset --hard` de esta última forma es peligroso, porque perdemos el último o últimos commits. Así que hay que asegurarse muy bien de que es eso lo que queremos**. 

!!!warning " "
	No borrar los repositorio local ni el remoto. Los volveremos a utilizar en la siguiente actividad.

<hr />




## 09. Archivo `.gitignore`

En esta actividad empezaremos a trabajar con algo más real. Por ejemplo, una sencilla aplicación de Java. Esta actividad también es práctica.

Vamos a seguir utilizando el repositorio que estabamos usando en las actividades anteriores.

```sh
git log  --oneline --all
```

<div style="text-align:center;">
    <img src="../../img/ud00/git-log3.png" alt="git-log3" style="max-width:80%;" />
</div>

###  Crear una aplicación HolaMundo en Java con nuestro IDE

Para ello abriremos nuestro IDE favorito (en mi caso Visual Studo Code) crearemos un nuevo proyecto (en mi caso *PruebasGit*) basado en la misma carpeta en la que tenemos nuestro repositorio local de GIT. Creamos la clase principal, y la modificamos para que pueda imprimir el típico "Hola mundo.".

Nuestra estructura de carpetas debería ser algo similar a esto:

<div style="text-align:center;">
    <img src="../../img/ud00/vscode_abc03.png" alt="vscode_abc03" style="max-width:75%;" />
</div>

### Añadir archivos al repositorio local

Como vimos en la actividad anterior, si ahora ejecutamos **`git diff HEAD`**, esperariamos ver los cambios de nuestro directorio de trabajo respecto al último commit.

Sin embargo esto no es lo que ocurre. **NO SE MUESTRA NADA**. ¿Por qué es esto?

Esto es porque <code>git diff HEAD</code> funciona siempre teniendo en cuenta los archivos que ya habían sido añadidos previamente al repositorio. Es decir sólo tiene en cuenta los archivos con seguimiento. 

**Los archivos nuevos son archivos sin seguimiento**. En este caso debemos usar **`git status`** para ver esta circunstancia.

<div style="text-align:center;">
    <img src="../../img/ud00/archivos-sin-seguimiento.png" alt="archivos-sin-seguimiento" style="max-width:80%;" />
</div>

Ahora debemos añadir todos estos archivos al área de preparación (*Staging Area*) y luego realizar un commit.

**PERO ESPERA UN MOMENTO. Voy a explicarte algo.**

**Cuando se trabaja con proyectos de código fuente existen algunos archivos que no interesa añadir al repositorio, puesto que no aportan nada**. En el repositorio, como norma general, no debe haber archivos ejecutables, ni bytecode, ni código objeto, y muchas veces tampoco .zip, .rar, .jar, .war, etc. Estos archivos inflan el repositorio y, cuando llevamos muchos commits, hacen crecer demasiado el repositorio y además pueden ralentizar el trabajo de descarga y subida.

Para cada lenguaje y para cada entorno de desarrollo se recomienda no incluir ciertos tipos de archivos. Son los **archivos a ignorar**. Cada programador puede añadir o eliminar de la lista los que considere adecuados. Los archivos y carpetas a ignorar deben indicarse en el archivo **`.gitignore`**. En cada línea se pone un archivo, una carpeta o una expresión regular indicando varios tipos de archivos o carpetas.

En el repositorio [https://github.com/github/gitignore](https://github.com/github/gitignore){:target="_blank"} tienes muchos ejemplos para distintos lenguajes, herramientas de construcción y entornos.

Para el lenguaje Java: [https://github.com/github/gitignore/blob/master/Java.gitignore](https://github.com/github/gitignore/blob/master/Java.gitignore){:target="_blank"}

Para la herramienta Gradle: [https://github.com/github/gitignore/blob/master/Gradle.gitignore](https://github.com/github/gitignore/blob/master/Gradle.gitignore){:target="_blank"}

Para el entorno VsCode: [https://github.com/github/gitignore/tree/main/Global/VisualStudioCode.gitignore](https://github.com/github/gitignore/tree/main/Global/VisualStudioCode.gitignore){:target="_blank"}

Nosotros, siguiendo las indicaciones de este último enlace vamos a ignorar las carpetas y archivos sugeridos. Entonces, el archivo **`.gitignore`** debe tener el siguiente contenido:

```sh
.vscode/*
!.vscode/settings.json
!.vscode/tasks.json
!.vscode/launch.json
!.vscode/extensions.json
!.vscode/*.code-snippets

# Local History for Visual Studio Code
.history/

# Built Visual Studio Code Extensions
*.vsix
```

La barra final es opcional, pero a mí me gusta ponerla cuando me refiero a carpetas, para así saber cuando se trata de un archivo y cuando de una carpeta.

Crea el archivo `.gitignore` con dicho contenido y haz una captura de pantalla.

Ahora si, hacemos:

```sh
git add .
git status
```

veremos que no nos aparecen las carpetas `dist`, `build` ni `nbproject/private`, ni ninguno de los archivos omitidos en `.gitignore`.

<div style="text-align:center;">
    <img src="../../img/ud00/gitignore.png" alt="gitignore" style="max-width:80%;" />
</div>

Ahora ya podemos ejecutar

```sh
git  commit  -m  "Código fuente inicial"
```

!!!note " "
	Fíjate que he escrito `git add .` . El punto indica el directorio actual, y es una forma de indicar que incluya en el área de preparación todos los archivos del directorio en el que me encuentro (salvo los archivos y carpetas indicados en `.gitignore`) Se utiliza bastante esta forma de git add cuando no queremos añadir los archivos uno a uno.

### Subir cambios de repositorio local a repositorio remoto

Ya sólo nos queda subir los cambios realizados al repositorio remoto con **git push**

<div style="text-align:center;">
    <img src="../../img/ud00/git-push.png" alt="git-push" style="max-width:80%;" />
</div>

Para hacer algo más interesante este apartado, vamos a crear una etiqueta en el commit actual y subirla a github para que éste cree una nueva *release*.

```sh
git  tag  v3
git  push --tags
```

<div style="text-align:center;">
    <img src="../../img/ud00/git-push-tags.png" alt="git-push-tags" style="max-width:80%;" />
</div>

En este caso, podríamos también haber ejecutado:

```sh
git push origin v3
```

Y la historia de nuestro repositorio local nos quedaría así de bonita:

<div style="text-align:center;">
    <img src="../../img/ud00/git-colorido.png" alt="git-colorido" style="max-width:80%;" />
</div>

Accede a tu repositorio en GitHub y haz una captura de pantalla de las *Tags*.

Haz otra captura de los archivos y carpetas de código subidas a GitHub. No deberían aparecer la carpeta `lib`. Y sí debería aparecer el archivo `.gitignore`.

!!!note " "
	La carpeta `.git` nunca se muestra en GitHub.

!!!warning " "
	No borrar los repositorio local ni repositorio remoto. Los volveremos a utilizar en la siguiente actividad.*

<hr />



## 10. Usar un par de claves SSH


!!!note " "
	GitHub ya no permite las conexiones por HTTP, solo por SSH, y esto ya lo hicimos al comenzar los ejercicios, así que te puedes saltar el paso 8 e ir directamente al punto 9. Lo dejo aquí como referencia y consulta.

Como habréis observado, cada vez que hacemos un `git push` nos pide el usuario y contraseña. Esto es bastante molesto.

Una forma de evitar esto es mediante un **par de claves SSH** (una clave privada y una clave pública). Ambas se complementa. La una sin la otra no sirve de nada.

Este método evita que nuestro usuario y contraseña de GitHub se guarde en un archivo de disco. Por tanto es muy seguro. En caso de que alguién haga login en nuestro PC podría acceder a nuestras claves. En dicho caso eliminaríamos el par de claves y volveríamos a crear unas nuevas y nuestro usuario y contraseña de GitHub nunca se verían comprometidos.

Vamos a seguir los siguientes pasos:

### Generar un par de claves SSH

Es muy sencillo. Como usuario normal (sin ser root) ejecutamos el comando

```sh
ssh-keygen
```

<div style="text-align:center;">
    <img src="../../img/ud00/ssh-keygen.png" alt="ssh-keygen" style="max-width:65%;" />
</div>

Pulsamos Intro a todo. Salvo que ya exista un par de claves previo. En ese caso nos preguntará si deseamos sobreescribir (Override (y/n)? ) En este caso, en esta pregunta respondemos y . Luego todo Intro.

Esto nos creará una carpeta **~/.ssh**  y dentro al menos 2 archivos: 

- **id_rsa**
- **id_rsa.pub**

El primero archivo corresponde a la clave privada y el segundo a la clave pública.

Copiamos el contenido de la clave pública en un editor de texto. Nos hará falta más adelante.

<div style="text-align:center;">
    <img src="../../img/ud00/id_rsa.pub.png" alt="id_rsa.pub" style="max-width:85%;" />
</div>

Debe copiarse  *ssh-rsa  ....  jose@lenovo* 

En vuestro caso, en lugar de jose@lenovo aparecerá otro usuario y pc.

### Añadir clave ssh pública a github.

Iniciamos sesión de GitHub y en el menú general (esquina superior derecha) seleccionamos la opción **Settings**.

<div style="text-align:center;">
    <img src="../../img/ud00/github-settings.png" alt="github-settings" style="max-width:85%;" />
</div>

Luego, en la parte izquierda, elegimos la opción **SSH y GPG keys**

<div style="text-align:center;">
    <img src="../../img/ud00/github-ssh-gpg.png" alt="github-ssh-gpg" style="max-width:85%;" />
</div>

A continuación, a la derecha, pulsamos en el botón **New SSH key**

<div style="text-align:center;">
    <img src="../../img/ud00/github-new-ssh-key.png" alt="github-new-ssh-key" style="max-width:85%;" />
</div>

Luego ponemos un nombre a la clave, por ejemplo pc-casa. Y copiamos el contenido de la clave pública. Finalmente, pulsamos en el botón **Add SSH key**	

<div style="text-align:center;">
    <img src="../../img/ud00/github-add-ssh-key.png" alt="github-add-ssh-key" style="max-width:85%;" />
</div>

La clave anterior puede usarse para cualquiera de nuestros repositorios. Para hacer uso de ella, lo único que necesitamos es la URL en formato SSH de cada repositorio.

### Comprobarque se ha creado bien

Si, por cualquier motivo, alguien accediera a nuestro PC y cogiera la clave privada, bastaría con eliminar esta clave pública de GitHub y al ladrón no le serviría de nada nuestra clave privada.

<div style="text-align:center;">
    <img src="../../img/ud00/github-list-ssh-keys.png" alt="github-list-ssh-keys" style="max-width:85%;" />
</div>

### Obtener URL SSH del repositorio

Botón **Clone or download**, **Use SSH**

Copiamos URL en formato SSH. Su formato es relativamente fácil de memorizar. Siempre git@githbub.com seguido de dos puntos **:**  y luego el **nombre de usuario / nombre de repositorio**.

<div style="text-align:center;">
    <img src="../../img/ud00/github-use-ssh.png" alt="github-use-ssh" style="max-width:85%;" />
</div>

### Asociar nuestro repositorio local mediante SSH

Nuestro repositorio local estaba asociado a origin mediante HTTPS. Debemos dar de baja dicho enlace y crear uno nuevo que haga uso del protocolo SSH.

Ejecutamos:

```sh
git  remote  remove  origin
git  remote  add  origin   git@github.com:tu_usuario/tu_repositorio
```

<div style="text-align:center;">
    <img src="../../img/ud00/git-remote-remove-add.png" alt="git-remote-remove-add" style="max-width:85%;" />
</div>

### Crear un commit y subimos a GitHub

Para comprobar que no nos pide usuario y contraseña cuando hagamos git push, vamos a modificar el archivo README.md , crear un commit y subir a GitHub.

Pondremos al principio de cada línea el símbolo >  y un espacio. El archivo README.md quedaría más o menos así:

```
> Arturo BC
> 12 Noviembre 2022
> IES Mestre Ramón Esteve
```

Luego guardamos. Ejecutamos:

```sh
git add README.md
git commit -m "Añadida cita"
git push -u origin master
```

Al ejecutar el último comando, se realizará una conexión SSH con GitHub.

<div style="text-align:center;">
    <img src="../../img/ud00/ssh-confirmacion..png" alt="ssh-confirmacion." style="max-width:75%;" />
</div>

Cuando se realiza una conexión SSH con una nueva clave, la primera vez se pide confirmación y deberás escribir **yes**. Después de ello, quedará registrado el host remoto en el archivo **.ssh/known_hosts**. Las siguientes veces ya no se pide confirmación, siempre que el archivo `.ssh/known_hosts` contenga dichos registros.

!!!warning " "
	No borrar los repositorio local ni repositorio remoto. Los volveremos a utilizar en la siguiente actividad.

<hr />

## 11. Resolviendo conflictos

En esta actividad veremos qué se entiende por conflicto, cuándo se produce y cómo resolverlo.

Como sabéis un mismo repositorio puede tener copias en distintos sitios.  Ahora mismo tenemos una copia en GitHub y otra local en nuestro PC. Pero **podrían existir más copias locales en otros PC**.

Siempre que realicemos cambios (es decir commits) en el mismo archivo en las mismas líneas pero en copias distintas, se producirá un conflicto.

Para ver esto, vamos a hacer un commit en nuestro repositorio en GitHub, y luego haremos un commit en nuestro repositorio local. Trabajaremos con el archivo `README.md` únicamente.

### Modificar archivo README.md remoto

En GitHub vamos a modificar el archivo `README.md` y registrar el cambio (commit).

Para ello, entramos en nuestro repositorio remoto, pulsamos sobre el archivo `README.md`y luego pulsamos sobre el lápiz para editar.

<div style="text-align:center;">
    <img src="../../img/ud00/readme-edit.png" alt="readme-edit" style="max-width:85%;" />
</div>

!!!note " "
	Recientemente (mediados de agosto de 2021) gitHub añadió una funcionalidad interesante a todos sus repositorios, y es la **posibilidad de abrir el editor vsCode online** para cualquier repositorio simplemente usando la *hotkey* `.`. <br />
	Por tanto podemos hacer esta modificación tal y como se muestra en las capturas, o pulsar la tecla "." (punto) y usar vsCode Online para hacer la modificación.

**Insertamos una primera línea con título # y modificamos la línea de la fecha**.

<div style="text-align:center;">
    <img src="../../img/ud00/github-readme.png" alt="github-readme" style="max-width:85%;" />
</div>

Registramos commit. Para ello pulsamos en **Commit changes**

Si lo deseamos, podemos poner un mensaje al commit y un descripción, aunque no es obligatorio. GitHub pone una por defecto.

<div style="text-align:center;">
    <img src="../../img/ud00/github-commit-changes.png" alt="github-commit-changes" style="max-width:75%;" />
</div>

### Modificar archivo README.md local

En nuestro repositorio local, también vamos a modificar el archivo README.md.

En este caso añadiremos una línea al final del archivo y modificaremos la línea de la fecha.

```sh
nano  README.md
```

<div style="text-align:center;">
    <img src="../../img/ud00/readme.png" alt="readme" style="max-width:40%;" />
</div>

Guardamos los cambios y registramos commit.

```sh
git add README.md
git commit -m "Actualización de README.md"
```

<div style="text-align:center;">
    <img src="../../img/ud00/readme-commit.png" alt="readme-commit" style="max-width:80%;" />
</div>

### Intentar subir el commit local

Al intentar subir nuestro commit local al repositorio remoto,  se rechazará.

```sh
git push
```

<div style="text-align:center;">
    <img src="../../img/ud00/git-push-conflicto.png" alt="git-push-conflicto" style="max-width:67%;" />
</div>

**Esto no es un conflicto. Simplemente nos dice que debemos actualizar antes nuestro repositorio local con el contenido del repositorio remoto**.

Si hemos realizado cambios en nuestro repositorio remoto, deberemos integrarlos en nuestro repositorio local antes de poder subir nuevos cambios locales.

### Se produce conflicto

Así que ejecutamos:

```sh
git pull origin master
```

para **bajar los commits del repositorio remoto** que no tenemos en local.

**Esto no tendría por qué provocar un conflicto. Pero en este caso sí se produce, porque hemos modificado el mismo archivo (`README.md`) y además en la misma linea (*la línea de la fecha*)**.

Así que se realiza la fusión, pero nos avisa que hay conflicto en dicho archivo. Deberemos resolverlo manualmente.

<div style="text-align:center;">
    <img src="../../img/ud00/git-pull-conflicto.png" alt="git-pull-conflicto" style="max-width:75%;" />
</div>

### Arreglar conflicto

Para arreglar el conflicto, abrimos el archivo en cuestión y en la línea o líneas donde se ha producido el conflicto veremos unas marcas como las siguientes:

**`<<<<<<<`**

```
 <<<<<<<
 línea o líneas en commit local
 =======
 línea o líneas en commit remoto
 >>>>>>>
```

<div style="text-align:center;">
    <img src="../../img/ud00/readme-conflicto.png" alt="readme-conflicto" style="max-width:50%;" />
</div>

**Resolver el conflicto consiste en elegir una de las 2 opciones y eliminar las marcas anteriores**. 
Aunque también podemos no elegir ninguna de las opciones y escribir otra en su lugar.
Esto es lo que yo he hecho aquí al poner fecha *11 agosto 2022*.

<div style="text-align:center;">
    <img src="../../img/ud00/readme-corregido.png" alt="readme-corregido" style="max-width:50%;" />
</div>

A continuación, guardamos los cambios. Y registramos un nuevo commit.

```sh
git add README.md
git commit  -m "Arreglado conflicto en README.md"
```

<div style="text-align:center;">
    <img src="../../img/ud00/conflicto.png" alt="conflicto" style="max-width:80%;" />
</div>

Ahora ya podremos subir nuestro commit con el conflicto solucionado.

````sh
git push origin master
````

<div style="text-align:center;">
    <img src="../../img/ud00/git-push-sin-conflicto.png" alt="git-push-sin-conflicto" style="max-width:80%;" />
</div>

!!!warning " "
	Para evitar situaciones como la anterior, es aconsejable **no realizar modificaciones en GitHub**, y si las hemos realizado o hemos subido commits desde otro repositorio local, lo primero que deberíamos hacer es `git pull`,  resolver los conflictos que puedan darse, realizar los commits locales que deseemos y finalmente subir commits a GitHub.<br /> 
	Resumiendo, una buena estrategia puede ser la siguiente: al principio del día haremos `git pull`, y al final del día haremos `git push`.

!!!warning " "
	No borrar los repositorio local ni repositorio remoto. Los volveremos a utilizar en la siguiente actividad.*

<hr />

## 12. Creación de ramas

En esta actividad vamos a empezar a trabajar con ramas. En concreto veremos cómo **crear nuevas ramas**.

Podemos definir una rama como un **desarrollo paralelo dentro del mismo repositorio**. Podemos iniciar dicho desarrollo paralelo en cualquier commit.

En esencia, las principales finalidades de las ramas son 2:

- **hacer cambios en el repositorio sin afectar a la rama master**. También aplicable a otras ramas.
- **hacer cambios en el repositorio e integrarlos posteriormente en la rama master**. También aplicable a otras ramas.

Por defecto cada repositorio de git dispone de una **rama master**. Ésta es la rama principal. 
Por motivos de seguridad, suele ser frecuente realizar los cambios en alguna otra rama y posteriormente integrarlos en la rama master. 
Existen **flujos de trabajo** ( [workflows](https://buddy.works/blog/5-types-of-git-workflows){:target="_blank"} ) en los que apenas se crean commits en la rama master, sólo se integran commits de otras ramas.

En esta actividad usaremos 2 métodos para trabajar con nuevas ramas:

 - **`git checkout -b`** *`nueva-rama`*
 - **`git branch`** *`nueva-rama`* ,   y luego **`git checkout`** *`nueva-rama`*

Comprobemos antes, el estado actual de nuestro repositorio. Con `git log ...` podemos ver que sólo tenemos la rama master. 

Para ello ejecutamos

```sh
git log --oneline --all --graph
```

La opción **`--graph`** nos permite ver las ramas de forma "gráfica".

<div style="text-align:center;">
    <img src="../../img/ud00/git-log-graph1.png" alt="git-log-graph1" style="max-width:80%;" />
</div>

Podemos ver también "otra rama" sin nombre con el commit `19ea Update README.md`. En realidad éste es el commit que editamos en *GitHub* en una actividad anterior y que tuvimos que fusionar en la rama local *master*, antes de volver a subirlo a GitHub.

### Crear rama mediante `git checkout`

El comando `git checkout -b  nueva-rama` tiene esencialmente 2 formas:

1. **`git checkout -b  nueva-rama`**  (creamos una nueva rama a partir del commit actual, y nos pasamos a ella).
2. **`git checkout -b  nueva-rama  commit-de-partida`**  (creamos una nueva rama a partir del commit indicado, y nos pasamos a ella).

En este apartado vamos a crear 2 ramas (las llamaremos `rama1` y `rama2`) a partir del primer commit, es decir el commit más antiguo, que tenemos etiquetado como `v1`.

Para crear `rama1` y movernos a ella, vamos a usar la forma más directa. Para ello hacemos:

```sh
git checkout -b rama1 v1
```

En dicha `rama1`, creamos un nuevo commit:

<div style="text-align:center;">
    <img src="../../img/ud00/git-nueva-rama1.png" alt="git-nueva-rama1" style="max-width:80%;" />
</div>

 El resultado es:

<div style="text-align:center;">
    <img src="../../img/ud00/git-log-graph2.png" alt="git-log-graph2" style="max-width:80%;" />
</div>

Ahora hagamos otra rama llamada `rama2` a partir del commit `v1`, de una forma un poco distinta.

Imaginemos que, por despiste, nos hemos movido al commit `v1` con:

````sh
git checkout v1
````

<div style="text-align:center;">
    <img src="../../img/ud00/git-checkout-v1.png" alt="git-checkout-v1" style="max-width:80%;" />
</div>

Como se nos informa en el mensaje, ahora mismo estamos trabajando en modo *despegado* (detached HEAD). Esto nos permite realizar los cambios que deseemos creando commits sin afectar a la rama master.

Lo aconsejable es ejecutar ahora el comando `git checkout -b rama2`, porque después se nos podría olvidar, y al cambiar de rama perderíamos los commits realizados. 

No obstante, vamos a simular que se nos olvida ejecutar el comando anterior. Empezamos a realizar commits. En este caso para simplificar, solo realizaremos un commit.

<div style="text-align:center;">
    <img src="../../img/ud00/nuevo-archivo-rama2.png" alt="nuevo-archivo-rama2" style="max-width:80%;" />
</div>

Esto nos crea un nuevo commit. Ejecutamos una vez más

```sh
git log --oneline --all --graph
```

<div style="text-align:center;">
    <img src="../../img/ud00/git-log-graph3.png" alt="git-log-graph3" style="max-width:80%;" />
</div>

Como se muestra en la captura, no existe ningún apuntador en forma de rama, así que si ahora, por ejemplo, ejecutásemos `git checkout master`, perderíamos todos los commits realizados (en este caso sólo uno, pero podrían ser muchos más).

Si no deseamos perder dichos commits, debemos ejecutar:

````sh
git checkout -b rama2
````

<div style="text-align:center;">
    <img src="../../img/ud00/git-log-graph4.png" alt="git-log-graph4" style="max-width:80%;" />
</div>

Después de esto, ya podremos cambiar de rama con `git checkout` sin miedo a perder los commits realizados anteriormente. 

Asegúrate de ejecutar el comando anterior antes de pasar al punto siguiente.

### Crear ramas con `git branch` ...

El comando `git branch  nueva-rama` tiene esencialmente 2 formas:

1. **`git branch  nueva-rama`**  (Creamos una nueva rama a partir del commit actual, pero NO nos pasamos a ella).
2. **`git branch  nueva-rama  commit-de-partida`**  (Creamos una nueva rama a partir del commit indicado, pero NO nos pasamos a ella).

Después de ejecutar una de las formas anteriores, siempre deberemos hacer después un `git checkout` si queremos trabajar con la nueva rama.

Vamos a ver su uso, haciendo uso de la segunda forma. Desde la rama actual, es decir rama2, vamos a crear 2 ramas (llamadas licencia y autor) a partir de la rama master.

```sh
git branch licencia master
git branch autor    master
```

<div style="text-align:center;">
    <img src="../../img/ud00/git-branch-nuevas-ramas.png" alt="git-branch-nuevas-ramas" style="max-width:80%;" />
</div>

Para empezar a trabajar con alguna de ellas, deberemos ejecutar `git checkout ...` Por ejemplo:

```sh
git checkout licencia
```

Con `git log --oneline --all --graph` podemos ver que el apuntador **`HEAD`** ahora apunta a la rama `licencia`.

<div style="text-align:center;">
    <img src="../../img/ud00/git-log-graph-licencia.png" alt="git-log-graph-licencia" style="max-width:80%;" />
</div>

En esta rama crearemos un archivo nuevo llamado `LICENSE`.

Para ello:

```sh
nano LICENSE
```

Escribimos dentro un línea con el texto siguiente: **GPL v3**

Y realizamos commit:

```sh
git add LICENSE
git commit -m "Nuevo archivo LICENSE"
```

Para trabajar con la rama `autor`, ejecutamos:

```sh
git checkout autor
```

En esta rama vamos a crear un archivo `AUTHOR` y además vamos a modificar el archivo `README.md`.

Para ello:

```sh
nano AUTHOR
```

Escribimos dentro un línea con el texto de vuestro nombre: **Arturo BC**

También modificaremos el archivo `README.md`. 
En la línea donde aparece nuestro nombre, cambiaremos el texto para ponerlo <u>todo</u> en mayúsculas. 
La finalidad es provocar un conflicto de fusión en un futuro, que resolveremos en la siguiente actividad.

Y realizamos commit:

```sh
git add AUTHOR
git commit -m "Nuevo archivo AUTHOR y editado README.md"
```

El resultado de `git log --oneline --all --graph` es:

<div style="text-align:center;">
    <img src="../../img/ud00/git-log-graph5.png" alt="git-log-graph5" style="max-width:80%;" />
</div>

### Subir ramas a repositorio remoto

Para subir todos los cambios realizados en <u>todas las ramas</u>:

**`git push origin --all`**

<div style="text-align:center;">
    <img src="../../img/ud00/git-push-all-origin.png" alt="git-push-all-origin" style="max-width:80%;" />
</div>

El resultado es que todos los apuntadores a ramas remotas se actualizan (aparecen en color rojo en la siguiente captura)

<div style="text-align:center;">
    <img src="../../img/ud00/git-log-graph6.png" alt="git-log-graph6" style="max-width:80%;" />
</div>

En **GitHub**, dentro del repositorio correspondiente, podemos ver un gráfico de las ramas pulsando en la pestaña **`Insights`** y luego en la opción **`Network`** (en la parte izquierda de la nueva página) 

<div style="text-align:center;">
    <img src="../../img/ud00/github-insights-network.png" alt="github-insights-network" style="max-width:85%;" />
</div>

!!!warning " "
	No borrar los repositorio local ni repositorio remoto. Los volveremos a utilizar en la siguiente actividad.*

<hr />

## 13. Fusión y eliminación de ramas

Esta actividad es una continuación de la anterior. En ella veremos cómo realizar **fusión de ramas** (**merge**) y como eliminar apuntadores a ramas antiguas.

Vamos a suponer que hemos trabajado en las ramas de la actividad anterior `rama1`, `rama2`, `licencia` y `autor` añadiendo varios commits más, aunque realmente no ha sido así (las ramas con un único commit no suelen ser tan frecuentes).

Y llega el momento de desechar el trabajo realizado en alguna rama e integrar el contenido de otras en la rama `master`.

**En esta actividad desecharemos el trabajo realizado en `rama2`, e integraremos en `master` las ramas `rama1`, `licencia` y `autor`**.

Para realizar fusión (merge) de ramas se utiliza el comando:

**`git merge ...`**

### Eliminar una rama local

Para eliminar una rama local se usa el comando:

```sh
git branch -d  rama
```

Por ejemplo, para borrar `rama2` hacemos

```sh
git branch -d rama2
```

No se ejecuta la eliminación, puesto que los cambios no han sido integrados en `master`, ni en ninguna otra rama. 

Para forzar la eliminación hacemos

```sh
git branch -D rama2
```

De esta manera perdemos todas las modificaciones que hubiésemos realizado en dicha rama.

<div style="text-align:center;">
    <img src="../../img/ud00/borrar-rama2-local.png" alt="borrar-rama2-local" style="max-width:80%;" />
</div>

### Fusionar ramas locales 

Vamos a integrar en la rama `master` los cambios realizados en `rama1`, `licencia` y `autor`.

Procederemos de la siguiente forma:

1. Cambiamos a rama `master`
2. Fusionamos rama `licencia`
3. Fusionamos rama `autor`
4. Fusionamos rama `rama1`

#### Cambiar a rama `master`

Es **MUY IMPORTANTE** cambiar a la rama `master`. Si no hacemos el cambio, todas las fusiones se realizarían sobre la rama `autor` (la rama en la que actualmente estamos).

Debemos hacer

```sh
git  checkout master
```

#### Fusionar rama `licencia`

Antes, fijémonos en la estructura de las ramas. Hacemos 

```sh
git log --oneline --all --graph
```

<div style="text-align:center;">
    <img src="../../img/ud00/git-log-graph7.png" alt="git-log-graph7" style="max-width:80%;" />
</div>

Observa que fusionar la rama `licencia` en la rama `master` es equivalente a mover los apuntadores `HEAD` y `master` hacia arriba, es decir, hacerlos coincidir con el apuntador `licencia`.

Este tipo de fusión es el más sencillo y nunca da conflictos. Se conoce como **fast-forward merge** (abreviado **FF**) o **fusión con avance rápido**.

Para fusionar esta rama hacemos

```sh
git merge licencia
```

<div style="text-align:center;">
    <img src="../../img/ud00/ff.png" alt="ff" style="max-width:80%;" />
</div>

Observa como queda tras la fusión. Únicamente se han movido los apuntadores `HEAD` y `master`.

<div style="text-align:center;">
    <img src="../../img/ud00/git-log-graph8.png" alt="git-log-graph8" style="max-width:80%;" />
</div>

!!!note " "
	No te preocupes ahora mismo por los apuntadores remotos (los que aparecen en color rojo). Más adelante los sincronizaremos con el repositorio remoto.

#### Fusionar rama autor

Si en lugar de fusionar una rama que está adelantada respecto a `master`,  lo que hacemos es fusionar una rama que está en paralelo con la rama `master`,  entonces realizaremos una **fusión de 3 vías** (**3-way merge**)

Este tipo de fusión puede provocar conflictos. Si ambas ramas contienen modificaciones en las mismas líneas en los mismos archivos puede producirse un conflicto.

En este caso, el archivo `README.md` posee una línea con el nombre del autor, pero con líneas distintas en las ramas `master` y `autor` (todo en mayúsculas). 

Para realizar la fusión:

```sh
git merge autor
```

Cuando aparezca el editor con el mensaje asociado, aceptaremos el mensaje o lo editaremos a nuestro gusto.

<div style="text-align:center;">
    <img src="../../img/ud00/3-way-autor.png" alt="3-way-autor" style="max-width:80%;" />
</div>

En este caso no llegó a producirse el conflicto. Se resolvió automáticamente a favor del contenido de la rama `autor`.
Por tanto el autor en el archivo `README.md` aparecerá todo en mayúsculas.

Fíjate como se ha creado un nuevo commit resultado de unir la rama `autor` y la rama `master`. 
Esto siempre sucede en la fusión de 3 vías.

<div style="text-align:center;">
    <img src="../../img/ud00/git-log-graph9.png" alt="git-log-graph9" style="max-width:80%;" />
</div>

#### Fusionar rama rama1

Por último, integraremos en master los cambios realizados en la `rama1`. 

Es un tipo de **fusión de 3 vías**, al igual que el anterior.

En este caso, no se producirá ningún conflicto, puesto que en está rama sólo hemos realizados cambios sobre el archivo `rama1.txt`, el cual no existe en la rama `master`.

Para realizar la fusión:

```sh
git merge rama1
```

Cuando aparezca el editor con el mensaje asociado, aceptaremos el mensaje o lo editaremos a nuestro gusto.

<div style="text-align:center;">
    <img src="../../img/ud00/3-way-rama1.png" alt="3-way-rama1" style="max-width:80%;" />
</div>

### Subir cambios a repositorio remoto

Para subir al repositorio remoto todos los cambios realizados en nuestro repositorio local, ejecutamos

```
git push origin --all
```

<div style="text-align:center;">
    <img src="../../img/ud00/git-push-all2.png" alt="git-push-all2" style="max-width:80%;" />
</div>

### Eliminar apuntadores a ramas locales

Para eliminar los apuntadores locales:

```sh
git branch -d rama1
```

Los apuntadores a `licencia` y `autor` no los eliminaremos, por si en el futuro deseamos seguir trabajando en dichas ramas.
	
<div style="text-align:center;">
    <img src="../../img/ud00/borrar-rama1-local.png" alt="borrar-rama1-local" style="max-width:80%;" />
</div>

### Eliminar apuntadores a ramas remotas

Para eliminar los apuntadores en el repositorio remoto:

```sh
git push origin --delete rama1
git push origin --delete rama2
```

<div style="text-align:center;">
    <img src="../../img/ud00/borrar-ramas-remotas.png" alt="borrar-ramas-remotas" style="max-width:80%;" />
</div>

Los apuntadores a `origin/licencia` y `origin/autor` no los eliminaremos, por si en el futuro deseamos seguir trabajando en dichas ramas.

Para ver el estado ejecutamos `git log ...`
Observa como las ramas están actualizadas y sincronizadas con el repositorio remoto.

<div style="text-align:center;">
    <img src="../../img/ud00/git-log-graph10.png" alt="git-log-graph10" style="max-width:80%;" />
</div>

### Comprobar cambios en repositorio remoto

Para ver un gráfico de las ramas en el repositorio remoto pulsamos en **Insights**, **Network**.

<div style="text-align:center;">
    <img src="../../img/ud00/github-insights-network2.png" alt="github-insights-network2" style="max-width:85%;" />
</div>


!!!question "area propuesta para el alumno/a"
	Subir a la plataforma *<u>AULES</u>* un documento PDF de nombre <u>*tarea12tunombre*</u> con las capturas de pantalla y explicaciones pertinentes.**<br />
	
	Como tarea, se propone<br />
	
	- volver a la rama `licencia`, añadir contenido al archivo `LICENSE` y hacer commit.<br />
	- volver a la rama `autor`, añadir contenido al archivo `AUTHOR` y hacer commit.<br />
	- integrar los cambios de ambas ramas en la rama `master`.

!!!warning " "
	No borrar los repositorio local ni repositorio remoto. Los volveremos a utilizar en la siguiente actividad.*

<hr />

## 14. Pull-request

###  pull-request

Sigue los pasos de esta práctica guiada para sugerir una modificación de cualquiera de los archivos de los repositorios del profesor [arturoblasco](https://github.com/arturoblasco). 

<ol>
    <li>Adjunta la captura de pantalla similar a esta donde se vé que has solicitado el pull request y que estás esperando a que se integre en el repositorio original. </li>
    <li>Explica qué significan cada uno de los 5 apartados señalados en la captura:</li></ol>

<div style="text-align:center;">
    <img src="../../img/ud00/vscode_10_pullrequest3.png" alt="vscode_10_pullrequest3" style="max-width:80%;" />
</div>

### pull-request 2

Siguiendo los pasos de la práctica anterior:

<ol><li>crearemos un repositorio en el que un compañero propondrá un pull-request que nosotros deberemos integrar en nuestro repositorio original y viceversa. </li>
    <li>deberemos realizar un pull-request a nuestro compañero y que él lo acepte.</li></ol>

Debes adjuntar a la tarea los pasos a seguir una vez recibido el *pull-request* para aceptarlo y que se integre en nuestro repositorio, y mostrar además donde aparece el nombre del usuario que ha colaborado con nostros en el repositorio.

## 15. Repositorio Local + VsCode + Repositorio remoto

En la siguiente práctica guiada vamos a configurar el espació de trabajo en el que trabajaremos a lo largo de este curso/módulo de Programación.

Los pasos a seguir van a ser:

* En **local**, en VS Code crear un proyecto Java, en el que crearemos un repositorio local.

* En **remoto**, crear un repositorio remoto en GitHub (será privado y daremos acceso al profesor/a).

* Enlazar nuestro Git local con nuestro Git remoto (en GitHub); así, podremos ir subiendo todos nuestros programas.

* Poner a nuestr@ profesor@ del módulo como colaborador@ de nuestro repositorio remoto.

Empecemos:

1. Abrimos *VS Code*. Accedemos a la pestaña de *JAVA PROJECTS*, pulsamos el icono de `+` y elegimos la primera opción `No build tools`.

<div style="text-align:center;">
    <img src="../../img/ud00/vscode_tarea3_01.png" alt="vscode_tarea3_01" style="max-width: 90%;" />
</div>


   Se abre otra ventana flotante en la que elegimos el lugar donde va a estar alojado nuestro proyecto; para ello, crearemos en nuestra raíz `~` la carpeta `pr` y pulsamos botón  `Select the project location`.

<div style="text-align:center;">
    <img src="../../img/ud00/vscode_tarea3_02.png" alt="vscode_tarea3_02" style="max-width:70%;" />
</div>


   Escribimos el nombre del proyecto `exercicisJava`.

<div style="text-align:center;">
    <img src="../../img/ud00/vscode_tarea3_03.png" alt="vscode_tarea3_03" style="max-width:80%;" />
</div>

!!!question "Creación de un primer proyecto, crear un repositorio local y un repositorio remoto Github"
	Podemos observar la estructura de nuestro primer proyecto Java con su primer programa, ¿*sabes cuál puede ser*?? sí, es nuestro querido *Hola Mundo*. <br />
	**(1)**  Las carpetas a tener en cuenta:
	
	- En primer lugar la carpeta `src` que será la que contenga todos nuestros ficheros fuente `.java`. A la derecha podemos observar el contenido del fichero `App.java`. 
	- La carpeta `bin` contendrá los ficheros ejecutables `.class` que se generen de la compilación de nuestros ficheros `.java`. 
	
	<div style="text-align:center;"> <img src="../../img/ud00/vscode_tarea3_04.png" alt="vscode_tarea3_04" style="max-width:85%;" /> /div>
	
	**(2)**  Desde un terminal, accedemos dentro de la carpeta de nuestro recién creado proyecto `~\pr\exercicisJava`. 
	
	```sh
	cd ~\pr\exercicisJava
	```
	
	<div style="text-align:center;"> <img src="../../img/ud00/vscode_tarea3_05a.png" alt="vscode_tarea3_05a" style="max-width:80%;" /> </div>
	
	**(3)**  Inicializamos ahí dentro, con la orden `git init`, nuestro repositorio local Git.
	
	```sh
	git init
	```
	
	<div style="text-align:center;"> <img src="../../img/ud00/vscode_tarea3_05b.png" alt="vscode_tarea3_05b" style="max-width:80%;" /> </div>
	
	Si observamos la estructura de la carpeta del proyecto vemos una carpeta oculta `.git`.
	
	<div style="text-align:center;"> <img src="../../img/ud00/vscode_tarea3_05c.png" alt="vscode_tarea3_05c" style="max-width:80%;" /> </div>
	
	Si realizamos un `git status` se observa que todavía no hemos introducido las carpetas contenidas en el proyecto en nuestro repositorio. 
	
	```sh
	git status
	```
	
	<div style="text-align:center;"> <img src="../../img/ud00/vscode_tarea3_06.png" alt="vscode_tarea3_06" style="max-width:80%;" /> </div>
	
	**(4)**  Para introducir las carpetas y ficheros del proyecto en el repositorio se generará el primit *commit*: `git add .` y a continuación `git commit -m "1) cargar proyecto inicial"`.
	
	```sh
	git add .
	```
	
	```sh
	git commit -m "1) carga proyecto inicial"
	```
	
	<div style="text-align:center;"> <img src="../../img/ud00/vscode_tarea3_07.png" alt="vscode_tarea3_07" style="max-width:80%;" /> </div>
	
	Se puede comprobar con `git status` que, en este momento, no existe ninguna modificación en el área de trabajo que no se encuentre en el repositorio.
	
	<div style="text-align:center;"> <img src="../../img/ud00/vscode_tarea3_08.png" alt="vscode_tarea3_08" style="max-width:80%;" /> </div>
	
	También se puede observar este primer *commit* con `git log`.
	
	```sh
	git log
	```
	
	<div style="text-align:center;"> <img src="../../img/ud00/vscode_tarea3_09.png" alt="vscode_tarea3_09" style="max-width:80%;" /> </div>
	
	**(5)**  Es hora de crear nuestro repositorio remoto en GitHub:
	
	<div style="text-align:center;"> <img src="../../img/ud00/vscode_tarea3_10.png" alt="vscode_tarea3_10" style="max-width:70%;" /> </div>
	
	El nombre de nuestro repositorio `exercicisJava`; descripción `1º CFGS DAW - Programación - Ejercicios de Java`, por ejemplo, acceso `Private` y, por el momento, NO crearemos el fichero *README* y .*gitignore* ni elegimos ningún tipo de licencia.
	
	<div style="text-align:center;"> <img src="../../img/ud00/vscode_tarea3_11.png" alt="vscode_tarea3_11" style="max-width:85%;" /> </div>
	
	Después de crear el anterior repositorio, entre otras opciones de terminar, encontramos:	
	
	<div style="text-align:center;"> <img src="../../img/ud00/vscode_tarea3_12.png" alt="vscode_tarea3_12" style="max-width:75%;" /> </div>
	
	**(6)**  Vamos a terminar ejecutando esta orden en nuestro terminal (DENTRO de nuestra carpeta de proyecto Java / repositorio local Git) en la que copiamos el repositorio remoto en local:
	
	```sh
	git remote add origin git@github.com:arturoblasco/exercicisJava.git
	```
	
	<div style="text-align:center;"> <img src="../../img/ud00/vscode_tarea3_13.png" alt="vscode_tarea3_13" style="max-width:95%;" /> </div>
	**(7)**  Para terminar, enlazamos el repositorio local de Git con el repositorio remoto en GitHub para "subir" nuestro proyecto local al repositorio remoto:
	
	```sh
	git push origin master
	```
	
	<div style="text-align:center;"> <img src="../../img/ud00/vscode_tarea3_14.png" alt="vscode_tarea3_14" style="max-width:85%;" /> </div>
	
	Si vemos en nuestro repositorio de GitHub la sincronización ha sido realizada:
	
	<div style="text-align:center;"> <img src="../../img/ud00/vscode_tarea3_15.png" alt="vscode_tarea3_15" style="max-width:80%;" /> </div>
	
	**(8)**  Para terminar, ponemos al profesor/a del módulo de Programación como colaborador de nuestro repositorio:
	
	<div style="text-align:center;"> <img src="../../img/ud00/vscode_tarea3_16.png" alt="vscode_tarea3_16" style="max-width:80%;" /> </div>