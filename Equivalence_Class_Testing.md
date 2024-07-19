# Equivalence Class Testing

## Intervals

- **Month:** (-∞, 1), [1, 12], (12, ∞)
- **Year:** (-∞, 2023), [2023, 2025], (2025, ∞)
- **Categories:** (-∞, 1), [1, 6], (6, ∞)

## Equivalence classes of valid values

- **NV1** = {Month: -∞ < month ≤ 0}
- **V1** = {Month: 1 ≤ month ≤ 12}
- **NV2** = {Month: 13 ≤ month < ∞}
- **NV3** = {Year: -∞ < year ≤ 2022}
- **V2** = {Year: 2023 ≤ year ≤ 2025}
- **NV4** = {Year: 2025 ≤ year < ∞}
- **NV5** = {Category: -∞ < category ≤ 0}
- **V3** = {Category: 1 ≤ category ≤ 6}
- **NV6** = {Category: 6 ≤ category < ∞}

## Test cases

| Test Case | Month | Year | Categories | Expected Output |
|-----------|-------|------|------------|-----------------|
| 1         | 0     | 2022 | 0          | Invalid         |
| 2         | 0     | 2022 | 5          | Invalid         |
| 3         | 0     | 2022 | 7          | Invalid         |
| 4         | 0     | 2024 | 0          | Invalid         |
| 5         | 0     | 2024 | 5          | Invalid         |
| 6         | 0     | 2024 | 7          | Invalid         |
| 7         | 0     | 2026 | 0          | Invalid         |
| 8         | 0     | 2026 | 5          | Invalid         |
| 9         | 0     | 2026 | 7          | Invalid         |
| 10        | 0     | 2022 | 0          | Invalid         |
| 11        | 6     | 2022 | 5          | Invalid         |
| 12        | 6     | 2022 | 7          | Invalid         |
| 13        | 6     | 2024 | 0          | Invalid         |
| 14        | 6     | 2024 | 5          | Valid           |
| 15        | 6     | 2024 | 7          | Invalid         |
| 16        | 6     | 2026 | 0          | Invalid         |
| 17        | 6     | 2026 | 5          | Invalid         |
| 18        | 6     | 2026 | 7          | Invalid         |
| 19        | 13    | 2022 | 0          | Invalid         |
| 20        | 13    | 2022 | 5          | Invalid         |
| 21        | 13    | 2022 | 7          | Invalid         |
| 22        | 13    | 2024 | 0          | Invalid         |
| 23        | 13    | 2024 | 5          | Invalid         |
| 24        | 13    | 2024 | 7          | Invalid         |
| 25        | 13    | 2026 | 0          | Invalid         |
| 26        | 13    | 2026 | 5          | Invalid         |
| 27        | 13    | 2026 | 7          | Invalid         |
