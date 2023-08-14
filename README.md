# plex-api
A fluent Java Library for interacting with the Plex Media Server API.

## Adding the Dependency

Add the dependency using Jitpack:

```groovy
repositories {
    maven { url 'https://jitpack.io' }
}

dependencies {
    implementation 'com.github.caseyscarborough:plex-api:0.0.1'
}
```

## Examples

```java
// Create a new server. Host defaults to http://localhost:32400.
PlexServer server = new PlexServer("http://localhost:32400", "<plex token>");

// Get the server name
server.host();

// Get the current user's username
server.myPlexUsername();

// Get the server library
Library library = server.library();

// List all sections
library.sections().forEach(System.out::println);

// List all settings
server.settings().all().forEach(System.out::println);

// Get a section/movie/show by ID
library.sectionById("4");
library.movieById("112486");
library.showById("59816");

// Get a section by name
Section tv = library.section("TV Shows");
Section movies = library.section("Movies");

// Scan a section for new media
movies.scan();

// List all items for a section
tv.all().forEach(System.out::println);

// Get a movie by title
Movie movie = movies.movie("The Lord of the Rings: The Fellowship of the Ring");
System.out.println(movie);

// Get a show by title
Show show = tv.show("The Mandalorian");
System.out.println(show);

// Get all episodes for a show (method #1)
show
    .seasons()
    .stream()
    .flatMap(s -> s.episodes().stream())
    .forEach(System.out::println);

// Get all episodes for a show (method #2, more efficient than going through seasons)
show
    .allEpisodes()
    .forEach(System.out::println);

// Find a movie using a filter
movies
    .find((v) -> v.title().contains("Lord of the Rings"))
    .forEach(System.out::println);

// Edit a movie
movie.edit(
    // Pass the key-value pairs in one after another
    "summary.value", "Young hobbit Frodo Baggins, after inheriting a mysterious ring from his uncle Bilbo, must leave his home in order to keep it from falling into the hands of its evil creator. Along the way, a fellowship is formed to protect the ringbearer and make sure that the ring arrives at its final destination: Mt. Doom, the only place where it can be destroyed.",
    "summary.locked", "0",
    "title.value", "The Lord of the Rings: The Fellowship of the Ring",
    "title.locked", "0"
);

// Upload poster from a URL
movie.uploadPosterFromUrl("https://www.themoviedb.org/t/p/w1280/6oom5QYQ2yQTMJIbnvbkBL9cHo6.jpg");

// Upload poster from a file
movie.uploadPosterFromFile("lotr.jpg");

// Retrieve/download a poster
byte[] poster = movie.poster();
Files.write(Paths.get("lotr.jpg"), poster);
```

Examples can also be found [here](https://github.com/caseyscarborough/plex-api/blob/master/examples/src/main/java/plex/api/examples/Application.java).
