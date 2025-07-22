# Write your MySQL query statement below
select max(n1.num) as num from MyNumbers n1 where n1.num in (select n2.num from MyNumbers n2 group by n2.num having count(n2.num)=1)