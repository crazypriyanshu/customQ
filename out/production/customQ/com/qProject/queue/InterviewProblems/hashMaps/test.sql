

Employee - name, department , salary, id
-- find the employee which has got 3rd max salary

select name
from employee
ORDER BY salary DESC
LIMIT(3, 1);
