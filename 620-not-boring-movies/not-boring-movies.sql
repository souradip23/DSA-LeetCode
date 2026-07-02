# Write your MySQL query statement below

-- select * from Cinema 
-- order by rating desc
-- limit 2;

SELECT *
FROM cinema c
WHERE c.id % 2 =1 
    AND 
    c.description != 'boring'
ORDER BY c.rating DESC;