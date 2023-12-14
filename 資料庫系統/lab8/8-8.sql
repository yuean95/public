SELECT S_id,P_id,Quan AS 銷售數量排序
FROM Sales
ORDER BY Quan Asc

SELECT S_id,P_id,Quan AS 銷售數量排序_高到低
FROM Sales
ORDER BY Quan Desc

SELECT *
FROM Sales
ORDER BY P_id,Quan
