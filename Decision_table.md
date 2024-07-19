# Decision Table

## Condition Stubs
- **C1:** 1 ≤ Month ≤ 12
- **C2:** 2023 ≤ Year ≤ 2025
- **C3:** 1 ≤ Categories ≤ 6

## Action Stubs
- **A1:** Valid Entry
- **A2:** Invalid Entry

### Condition Stubs

|                    | Rule 1 | Rule 2 | Rule 3 | Rule 4 | Rule 5 | Rule 6 | Rule 7 | Rule 8 |
|--------------------|--------|--------|--------|--------|--------|--------|--------|--------|
| **C1: 1 ≤ Month ≤ 12** | T      | T      | T      | T      | F      | F      | F      | F      |
| **C2: 2023 ≤ Year ≤ 2025** | F      | F      | T      | T      | F      | F      | T      | T      |
| **C3: 1 ≤ Categories ≤ 6** | F      | T      | F      | T      | F      | T      | F      | T      |

### Action Stubs

|                    | Rule 1 | Rule 2 | Rule 3 | Rule 4 | Rule 5 | Rule 6 | Rule 7 | Rule 8 |
|--------------------|--------|--------|--------|--------|--------|--------|--------|--------|
| **A1: Valid Entry**    |        |        |        | X      |        |        |        |        |
| **A2: Invalid Entry**  | X      | X      | X      |        | X      | X      | X      | X      |

