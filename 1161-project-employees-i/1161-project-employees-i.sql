# Write your MySQL query statement below
SELECT p.project_id, round(avg(e.experience_years), 2) as average_years from Project p INNER JOIN Employee e on 
p.employee_id = e.employee_id Group By p.project_id;