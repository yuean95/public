START TRANSACTION;
SELECT employee_id ,employee_Name, employee_Add FROM employee
WHERE employee_Add LIKE '台南市東區%';
SELECT employee_id ,employee_Name, SUBSTRING(employee_Add FROM 1 FOR 3) AS city, SUBSTRING(employee_Add FROM 4 FOR 2) AS zone, SUBSTRING(employee_Add FROM 6 FOR 44) AS address FROM employee
WHERE SUBSTRING(employee_Add FROM 1 FOR 3) = '台南市';
COMMIT;
