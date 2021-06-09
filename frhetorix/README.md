# Frhetorix

Keywords: serverless, faas, api, javafx, desktop, gui, frequency analysis, concurrency

This project is meant for an experienced azubi with coding skills already present. Goal is to get hands on experience with serverless and at least one cloud provider (we use AWS). In the duration of this project the software will evolve from a compute-on-machine to a compute-on-serverless resources. Necessary technical, historical and social aspects of the trend towards serverless are also part of this project and should give the azubi background information and a frame of relevance.

## Idea

How have lyrics of music changed over time? Which words are used most often in songs and what are their topics over time?
Write a desktop application visualizing a tag cloud based on Spotify data.
To build up data you will utilize a lambda for collecting your text corpus.
Your desktop application will analyse that data and display a tag cloud per year.

![image](https://user-images.githubusercontent.com/3327413/116889912-643a9a00-ac2d-11eb-9151-eeaf08650c5f.png)


## Prerequesites

  * get yourself a Spotify developer account for the Web API (https://developer.spotify.com/documentation/web-api/reference/)
  * get yourself an AWS account for the infrastructure

## Round 1: The desktop application

The frontend of your application will be a JavaFX desktop application displaying a tag cloud.
For starters let's have a text area to write lots of text into and two buttons. One button will start the analysis and
display a tag cloud (https://en.wikipedia.org/wiki/Tag_cloud), the other button will abort the current analysis and reset the tag cloud.
Results shall be persisted locally and reloaded on following application starts (application state).
Bonus: feel free to add additional statistics about the text corpus (#words, punctuation, etc).

### Tasks

  * create a gradle project and github repository
  * implement a graphical JavaFX application with one text area and two buttons but no functionality
  * create a flow chart and class diagram for the given problem
  * How would you structure your application classes using MVC?
  * Implement the pieces, remember to write unit tests for the important bits.
  * How long does the term frequency analyse take? How long the chart rendering?
  * Have a look at the tag cloud. How might significance of words be improved even further?


## Round 2: Technical and social background

You now have a working desktop application. The computation of the word cloud and the data processing is done on your machine. What kind of CPU do you have? How many cores? To better understand the trend towards serverless and the need to put computing into the cloud we compiled a list of resources and questions for you to answer.

 * read https://www.cs.utexas.edu/~lin/cs380p/Free_Lunch.pdf and answer "Why do cpus do not get faster in terms of Ghz"?
 * explain amdahls law: https://en.wikipedia.org/wiki/Amdahl%27s_law

### tasks related to technical aspects

* how can a software still become faster? Explain how the project SETI worked (https://www.spiegel.de/netzwelt/web/seti-home-keine-ausserirdischen-entdeckt-jetzt-ist-das-coronavirus-dran-a-02fee57f-7d9d-429b-bda2-a5336fcdb25e)
* what are sources of delay in computing a solution? Explain cpu and memory bound? 

```
your job is to find an element in list which is NOT sorted. if a comparison takes 1 unit of time and you have 1000 elements to go through, 
- how long does it take for one person?
- if you devide your work between 2 people?
- if you devide your work between 4 people?
```

now that you understand, that scaling requires a different modeling of computing and maybe a different algorithmic approach let's look at the social aspect of software development as a team:

### tasks related to social aspects

 * read https://zenodo.org/record/1236158/files/article.pdf
 * explain conway's law: https://en.wikipedia.org/wiki/Conway%27s_law

 * what is a good team size? 
```Teams have to communicate and coordinate internally. Let's say communication cost is 1 hour per day between 2 people. Draw a diagram and count the cost for a team of 2, 4, and 6 members.```

 * Where does the "2 pizza team size" come from? Why does it make sense in your opinion?
 * for some background information regarding microservices view: https://www.youtube.com/watch?v=CZ3wIuvmHeM

## Round 3: into the wonderful world of serverless 

view: https://www.youtube.com/watch?v=rFW6ArVOCro

