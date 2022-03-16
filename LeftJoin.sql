--Question Ref https://leetcode.com/problems/combine-two-tables/
select p.firstName, p.lastName, a.city, a.state from Person p left join Address a on (a.personId = p.personId)
GO