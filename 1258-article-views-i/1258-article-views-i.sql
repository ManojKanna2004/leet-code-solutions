# Write your MySQL query statement below
SELECT distinct author_id AS id
from views
where author_id = viewer_id 
order by id;
