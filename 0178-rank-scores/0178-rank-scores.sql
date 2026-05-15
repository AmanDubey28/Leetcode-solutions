# DENSE_RANK() gives the same rank to same scores
# without skipping rank numbers

SELECT 
    score,
    DENSE_RANK() OVER (ORDER BY score DESC) AS 'rank'
FROM Scores;