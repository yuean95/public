SELECT shohin_catalg,COUNT(*) FROM shohin
GROUP BY shohin HAVING COUNT(*)=2;
