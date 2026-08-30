
```drawio-resource
../plantuml.drawio
```

[TOC levels=6]

An [Ecore](https://ecore.models.nasdanika.org/) model of **PlantUML documents as data**: `.puml` files as model resources.

It sits on the [presentation](https://presentation.models.nasdanika.org/) floor, which sits on [diagram](https://diagram.models.nasdanika.org/), which is a rooftop on the [C4](https://c4.models.nasdanika.org/) floor of the [Nasdanika model tower](https://nasdanika.com/models.html).
A document is a presentation and a block is a slide is a diagram: [`PlantUmlDocument`](references/eClassifiers/PlantUmlDocument/index.html) extends presentation `Presentation`, and [`PlantUmlDiagram`](references/eClassifiers/PlantUmlDiagram/index.html) - one `@startuml ... @enduml` block - extends `Slide`, because a single `.puml` file may hold several blocks the way a deck holds several slides.
Which means this model holds only what makes PlantUML *PlantUML*, and inherits the rest: identity, documentation, properties, tags, semantic mapping, bounds, and the containment tree all come from the floors below, and everything loaded here is exchangeable with [Draw.io](https://drawio.models.nasdanika.org/), [Mermaid](https://mermaid.models.nasdanika.org/), [PowerPoint](https://powerpoint.models.nasdanika.org/), and [Visio](https://visio.models.nasdanika.org/) through the shared supertypes.

## The thesis

**In diagram-as-code, the source is the artifact - which is PlantUML's strength and its ceiling.**
PlantUML is the engineer's diagram notation: the widest kind coverage of any text format - sequence, class, component, deployment, state, activity, timing, ER, Gantt, mindmap, WBS, wireframes, JSON and YAML visualization - with a preprocessor, styling, and two decades of muscle memory in engineering teams.
But the pipeline ends at the renderer: text goes in, an image comes out, and after that there is nothing - no queryable object graph, no stable element identity a risk register can reference, no cross-diagram links that resolve, no way to ask "which diagrams depict this component".
This model is about life after rendering.
Sequence diagrams go first, for a reason given below.

**The Draw.io sunset, faced squarely.**
[Draw.io is phasing out its PlantUML support in favor of Mermaid](https://www.drawio.com/blog/plantuml-to-mermaid): the online editor at the end of 2025, Confluence and Jira Cloud by 2028.
That removes an embedding surface, not the notation's value - but it strands a very large population of diagrams, and "rewrite them by hand" is the kind of migration advice that produces PNG graveyards.
Here the sunset becomes a model transformation: load `.puml`, meet the family in the shared structural view, save as `.mmd` or `.drawio` - and the trip is honest, because what parses structurally converts, and what does not is preserved verbatim and reported rather than silently mangled.

## Competitive landscape

**Kroki and render pipelines.**
Text to image, one direction, no round trip, no semantics attached.
Useful plumbing, addressing none of the after-render questions.

**Mermaid.**
A sibling on the same floor, not a competitor - the [Mermaid model](https://mermaid.models.nasdanika.org/)'s readme states the relationship from its side.
Mermaid has the ecosystem gravity: native rendering on every forge, the default notation of language models, and now Draw.io's blessing.
PlantUML has the expressiveness: more kinds, more control, a preprocessor, and the component and deployment diagrams Mermaid does not match.
Both load into the same base, so everything above the floor is format-neutral, and preferring one notation stops being a strategic commitment.

**One-off converters.**
plantuml2drawio and its cousins solve one direction of one problem, produce output that exists to be pasted, and know nothing about the semantics a diagram might carry.
A migration through a typed model is repeatable, reviewable, and keeps the source.

## What a typed model adds

**Sequence diagrams become animation scripts.**
The reason the sequence parser goes first: a sequence diagram is an animation script by construction - participants in columns, messages in order, time flowing down the page - and its participants are the boxes on somebody's Draw.io drawing.
An animation starter button on the drawing carries a property referencing the `.puml` resource; the `animate` CLI command loads it through this model, and a capability-resolved generator matches participants to the cells that depict them and emits typed highlight and flow steps behind the button.
One interaction, stated once, shown twice: in time on the sequence diagram, in space on the drawing people already trust.
The [Draw.io model](https://drawio.models.nasdanika.org/) carries the full treatment, including the command pipeline and the generator resolution.

**Work breakdown is already authored here.**
PlantUML WBS, Gantt, and activity diagrams are where planning happens before it is retyped into a tracker.
Loaded as models, they become sources for the [work](https://work.models.nasdanika.org/) floor rather than exports from it - the draw-first, execute-later thesis applied to planning.

**C4-PlantUML estates get a second life.**
The C4-PlantUML convention put typed intent into text: `System`, `Container`, `Component`, `Rel`.
Parsed, those diagrams are not just pictures but candidate instances for the [C4](https://c4.architecture.models.nasdanika.org/) and [architecture](https://architecture.models.nasdanika.org/) floors - an estate of architecture diagrams becoming an architecture model, one mapping at a time.

## Applications

**Animation authoring for hybrid diagrams.**
The flagship, described above: hand-drawn Draw.io diagrams with animations generated from PlantUML sequence diagrams maintained beside the code they describe, owned by someone other than the diagram's author, one drawing carrying one button per scenario.

**Documentation generation, both directions.**
Generate PlantUML from tower models where a text artifact in a repository is the right deliverable, and lift existing PlantUML into generated documentation sites - every block a page, structure and neighbors linked, the same pipeline the family runs for every notation - demonstrated in [plantuml-doc](https://github.com/Nasdanika-Templates/plantuml-doc) template repository.

**Semantic mapping.** For example, an Xcore model can be loaded from a class diagram.

**Planning intake.**
WBS and Gantt sources loaded into the work floor, then reconciled against trackers instead of retyped into them.

## Model overview

| Area | Types |
|------|-------|
| Document | [PlantUmlDocument](references/eClassifiers/PlantUmlDocument/index.html) extends presentation `Presentation`; one `.puml` file, one or more blocks |
| Diagram | [PlantUmlDiagram](references/eClassifiers/PlantUmlDiagram/index.html) extends `Slide`: `kind`, verbatim `source` (without the `@startuml`/`@enduml` delimiters), `blockName`, `parsed` |
| Kinds | [DiagramKind](references/eClassifiers/DiagramKind/index.html): sequence, class, object, use case, activity, component, deployment, state, timing, ER, Gantt, mindmap, WBS, JSON, YAML, Salt, network, with `OTHER` for the rest |
| Reused, not redefined | presentation `Presentation`, `Slide`; diagram `Node`, `Connection`, `Property`, `semanticElements`; nxcore identity, documentation, markers |

## Relation to other Nasdanika work

Base classes come from the [presentation model](https://presentation.models.nasdanika.org/) over the [diagram model](https://diagram.models.nasdanika.org/), and through them the [C4](https://c4.models.nasdanika.org/) floor and everything under it.
The siblings - [Draw.io](https://drawio.models.nasdanika.org/), [Mermaid](https://mermaid.models.nasdanika.org/), [PowerPoint](https://powerpoint.models.nasdanika.org/), [Visio](https://visio.models.nasdanika.org/), [ODP](https://odp.models.nasdanika.org/), [PDF](https://pdf.models.nasdanika.org/), and [Sprotty](https://sprotty.models.nasdanika.org/) as the rendering target - each load and generate over the shared models rather than carrying metamodels of their own.
The `animate` command lives in the [Nasdanika CLI](https://docs.nasdanika.org/nsd-cli/) under [`nsd drawio`](https://docs.nasdanika.org/nsd-cli/nsd/drawio/index.html) and behind a `drawio` cast under [`nsd model`](https://docs.nasdanika.org/nsd-cli/nsd/model/index.html), with animation generators resolved through the [capability framework](https://docs.nasdanika.org/core/capability/index.html) - this model is one of its source loaders, next to Mermaid, Groovy DSL, YAML, JSON, and XMI.
The [work](https://work.models.nasdanika.org/) floor consumes WBS, Gantt, and activity sources loaded here; [ELK](https://elk.models.nasdanika.org/) layout and three-way merge arrive through the shared floors, written once for the whole family.

## Resources

* [Nasdanika Models](https://nasdanika.com/models.html)
* [docs.nasdanika.org](https://docs.nasdanika.org/index.html)
* [Beyond Diagrams](https://leanpub.com/beyond-diagrams)
* [Nasdanika Medium publication](https://medium.com/nasdanika/all)
