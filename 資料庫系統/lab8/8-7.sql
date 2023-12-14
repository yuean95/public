SELECT Count(*) AS 公司總人數
FROM Employee

SELECT Count(*) AS 銷售筆數
FROM Sales

SELECT S_id, AVG(Quan) AS 平均數量
FROM Sales
GROUP BY S_id

SELECT SUM(Quan) AS 手錶總數量
FROM Sales
WHERE P_id='P0005'

SELECT MAX(Quan) AS 手錶最高數量
FROM Sales
WHERE P_id='P0005'
