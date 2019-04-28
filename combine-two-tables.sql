# Write your MySQL query statement below
select p.FirstName,p.LastName,a.City,a.State
from Person as p LEFT OUTER JOIN Address as a ON p.PersonId = a.PersonId;