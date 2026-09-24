# Mini Gestor de Biblioteca

Proyecto de práctica para aprender a conectar **Java con una base de datos SQLite** usando **JDBC**. Consiste en un gestor de libros y autores que se construye por etapas.

## Estado actual

- [x] Base de datos SQLite con tablas `autores` y `libros3` (relacionadas por `autor_id`)
- [x] Conexión JDBC funcionando (`ConexionDB`)
- [x] Prácticas de conexión (`practica/`)
- [ ] `SELECT` desde Java con `Statement` y `ResultSet`
- [ ] Clases `Autor` y `Libro` (`modelo`)
- [ ] DAOs con las operaciones CRUD (`dao`)
- [ ] Menú en consola

## Tecnologías

- Java 25
- SQLite
- sqlite-jdbc 3.53.4.0 (Xerial)
- IntelliJ IDEA

## Estructura

```
mini-gestor-biblioteca/
├── lib/                  ← sqlite-jdbc (no se sube al repo)
├── data/                 ← libros2.db (no se sube al repo)
└── src/
    ├── biblioteca/
    │   ├── Main.java
    │   ├── db/           ← ConexionDB
    │   ├── modelo/       ← Autor, Libro (pendiente)
    │   └── dao/          ← LibroDAO, AutorDAO (pendiente)
    └── practica/         ← repeticiones de la conexión
```

## Cómo ejecutarlo

1. Descarga `sqlite-jdbc-3.53.4.0.jar` desde
   [Maven Central](https://mvnrepository.com/artifact/org.xerial/sqlite-jdbc)
   y ponlo en la carpeta `lib/`.
2. Agrega el `.jar` como librería en IntelliJ (clic derecho → *Add as Library*).
3. Crea la carpeta `data/` con la base `libros2.db`, que debe contener las tablas
   `autores` y `libros3`. (El script `sql/schema.sql` se agregará más adelante.)
4. Ejecuta `Main.java`. Si todo está bien, imprime `Conectado`.

## Qué aprendí hasta ahora

- SQL básico: `CREATE TABLE`, `INSERT`, `SELECT`, `UPDATE`, `DELETE` y `JOIN`
- Claves primarias y foráneas
- Conexión con `DriverManager.getConnection()`
- `try-with-resources` para cerrar la conexión automáticamente
- Excepciones *checked* (`SQLException`): `try/catch` vs `throws`
- Errores comunes: `No suitable driver`, `SQLITE_CANTOPEN`