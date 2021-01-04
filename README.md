# MaximizePresentersProblem
A problem to maximize the number of presenters

You are the organiser of a conference and need to schedule presentations. You have received requests from N presenters stored in the csv file along with other details as

Presenter Name
No. of Hours for Presentation
Cost benefit for presenter
P1
2
$100

P2
4
$200

P3
2
$50

..
Pn
1
$400

● The first column is the presenter name
● Second column indicates number of hours presenter will take for the presentation
(assume it to be an integer)
● Last one indicates the associated cost (Fees that presenter will charge).

You are given that your conference will last for N hrs (N taken as an input) divided into 3 sessions (with no breaks and back to back presentation for example 8 hrs=3+3+2 hrs) and any of the session do not exceed N/2 hours.


Write the code to provide the following solution.


Maximize the number of presenters - Select the case that fits in maximum number of presenters in the given time schedule. If multiple cases satisfy this scenario, select the ones with minimum cost.
A session need not be fully utilized. But it should not be left empty without a presentation or. In case all the 3 sessions can’t be filled then output should be ​“Not enough presenters”.
Note: Host the solution on​ ​github.com(​ not compulsory but it would have weightage) and share the link with us along with unit test cases with sample data to support your solution.
Points to evaluate -
● Use of data structure
● Unit tests
● Logic and efficiency of the solution.
