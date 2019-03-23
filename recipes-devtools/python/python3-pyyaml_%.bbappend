# libyaml-vendor builds libyaml.so .

DEPENDS_remove = "libyaml"
DEPENDS_append = "libyaml-vendor"

RDEPENDS_${PN} += "libyaml-vendor"
