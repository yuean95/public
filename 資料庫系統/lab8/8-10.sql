SELECT S_id,AVG(Quan) AS 平均數量
FROM Sales
GROUP BY S_id
HAVING AVG(Quan)>70

SELECT S_id,Count(*) AS 銷售產品種類
FROM Sales
GROUP BY S_id
HAVING Count(*)>=2
