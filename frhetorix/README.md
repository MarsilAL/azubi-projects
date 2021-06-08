# Frhetorix

Keywords: serverless, faas, api, javafx, desktop, gui, frequency analysis, concurrency

## Idea

How have lyrics of music changed over time? Which words are used most often in songs and what are their topics over time?
Write a desktop application visualizing a tag cloud based on Spotify data.
To build up data you will utilize a lambda for collecting your text corpus.
Your desktop application will analyse that data and display a tag cloud per year.

![image](https://user-images.githubusercontent.com/3327413/116889912-643a9a00-ac2d-11eb-9151-eeaf08650c5f.png)



## Prerequesites

  * get yourself a Spotify developer account for the Web API (https://developer.spotify.com/documentation/web-api/reference/)
  * get yourself an AWS account for the infrastructure

## Round 1: Desktop application

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


