def intParamWithin(String paramName, int minInclusive, int maxInclusive) {
  def vStr = binding.hasVariable('params') ? params.get(paramName) : env["${paramName}"]
  if (!vStr?.toString()?.trim()) { error "Parameter '${paramName}' is required." }
  int v
  try { v = Integer.parseInt(vStr.toString()) } catch (e) {
    error "Parameter '${paramName}' must be an integer, got: '${vStr}'"
  }
  if (v < minInclusive || v > maxInclusive) {
    error "Parameter '${paramName}' must be between ${minInclusive} and ${maxInclusive}, got: ${v}"
  }
  echo "✔ ${paramName}=${v} within [${minInclusive}, ${maxInclusive}]"
  return v
}
