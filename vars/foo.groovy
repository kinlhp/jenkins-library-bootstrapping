call(Map args) {
    name = args.name
    echo (name == null || name.trim().isEmpty()) ? "Hello!" : "Hello ${name}!"
}
