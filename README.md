# A public printer at a university

## Functional requirements 

The system must:
- print documents
- allow user to input the number of copies of the document they want to print
- allow user to select colours for printing (black-white or colorful)
- allow user to change the paint if it runs out
- notify user if the paint run out

## Non-functional requirements

The system should be:
- available from 8am to 6pm on weekdays
- usable at temperatures from 0 to 40 degrees Celsius.

## Use cases

### Use case "Print document"

**Title**: *Print document*

**Primary Actor**: *Student*

**Success Scenario:**
1. Student loads document into system
2. System asks the number of copies for printing
3. Student inputs the number of copies for printing
4. System prints documents with current setting
5. Student picks up the printed documents

**Extensions:**

**a:** The paint run out

4a. System notifies to change the paint

### Use case "Change settings"

**Title**: *Change settings*

**Primary Actor**: *Student*

**Success Scenario:**
1. Student chooses colours for printing (black-white or colorful)
2. System saves settings

### Use case "Change paint"

**Title**: *Change paint*

**Primary Actor**: *Administrator*

**Success Scenario:**
1. Administrator adds the paint into the system
2. The system notifies the paint is added

### Use cases diagram

![Use cases diagram](/assets/images/UseCasesDiagram.jpg)

## Objects

- Printer system
- Setting
- Document
- Paint container

## Relationships

![Class Relationships](/assets/images/ClassRelationship.jpg)

## Class diagrams

![Class diagrams](/assets/images/ClassDiagram.png)