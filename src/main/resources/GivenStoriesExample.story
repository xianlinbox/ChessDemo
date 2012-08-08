Meta:
@author liuxianning
@theme  givenstories

Narrative: In order to update a new student,as a teacher, I want to update a student name
Scenario: Add a student into the class
GivenStories: AddStudentIntoClass.story
Given Get student "Lincoln"
When system Update student name to "Lin"
Then we can get student 'Lin' from class