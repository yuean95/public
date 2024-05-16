START TRANSACTION;
-- (1)
SELECT strcol FROM  SampleLike
WHERE strcol LIKE 'ddd%';
-- (2)
SELECT strcol FROM  SampleLike
WHERE strcol LIKE '%ddd%';
-- (3)
SELECT strcol FROM  SampleLike
WHERE strcol LIKE '%ddd';
COMMIT;
