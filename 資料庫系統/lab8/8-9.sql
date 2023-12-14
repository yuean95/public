SELECT S_id,Count(*) AS 銷售產品品類總數
FROM Sales
GROUP BY S_id

SELECT S_id,AVG(Quan) AS 平均數量
FROM Sales
GROUP BY S_id

SELECT P_id,Count(*) AS 銷售員工數
FROM Sales
GROUP BY P_id
ORDER BY P_id Desc

SELECT P_id,Count(*) AS 銷售員工數,MAX(Quan) AS 最高數量
FROM Sales
GROUP BY P_id
ORDER BY P_id

SELECT P_id,Count(*) AS 銷售員工數,AVG(Quan) AS 平均數量
FROM Sales
GROUP BY P_id
ORDER BY P_id
