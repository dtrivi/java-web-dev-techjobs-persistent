## Part 1: Test it with SQL

    id INT,
    employer VARCHAR(255),
    name VARCHAR(255),
    skills VARCHAR(255)

## Part 2: Test it with SQL
SELECT name
FROM employer
WHERE (employer.location = "St. Louis City");

## Part 3: Test it with SQL
DROP TABLE job;

## Part 4: Test it with SQL
SELECT skill.name, skill.description
FROM skill
INNER JOIN job_skills ON skill.id = job_skills.skills_id
ORDER BY skill.name ASC