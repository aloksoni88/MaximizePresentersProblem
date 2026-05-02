# MaximizePresentersProblem

> A scheduling optimisation problem: given N presenters with hours and costs, maximise the number of presenters across 3 conference sessions within a time constraint.
> Language: Java | Approach: Greedy + Constraint satisfaction | Input: CSV

---

## Problem statement

You are the organiser of a conference and need to schedule presentations across **3 sessions** (no breaks, back-to-back). The conference lasts N hours divided into 3 sessions — no session exceeds N/2 hours.

**Goal:** Select the combination that fits the **maximum number of presenters**. If multiple combinations satisfy this, select the one with **minimum total cost**.

**Constraints:**
- Each session must have at least one presenter
- If all 3 sessions cannot be filled → output `"Not enough presenters"`
- Input is read from a CSV file with columns: Presenter Name, Hours, Cost

---

## Input format (CSV)

```
Presenter Name, Hours, Cost
P1, 2, $100
P2, 4, $200
P3, 2, $50
Pn, 1, $400
```

---

## Approach

- **Data structure:** Priority Queue (min-heap by hours, then cost) for greedy selection
- **Algorithm:** Greedy scheduling — fill sessions shortest-first to maximise presenter count
- **Tie-breaking:** When count is equal, minimise total cost
- **Edge case handling:** Empty sessions, insufficient presenters, uneven time splits

---

## How to run

```bash
# Compile
javac src/com/alok/*.java

# Run with conference duration
java com.alok.Main  
```

---

## About me

**Android Automotive Technical Architect** · 15+ years building production systems on AOSP, VHAL, and Android Framework.

- LinkedIn: [linkedin.com/in/alok-soni-0b278042](https://www.linkedin.com/in/alok-soni-0b278042/)
- GitHub: [github.com/aloksoni88](https://github.com/aloksoni88)
