# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Some fast/convenient type converters, mostly for char strings or strings.      These are not really fully fleshed out, alot of them could use the addition for      the whole range of fundamental types (e.g. all integers, not just int, unsigned int).       They will come as the need arises."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "bouncy"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=13;endline=13;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "ecl-build ecl-concepts ecl-config ecl-errors ecl-exceptions ecl-license ecl-mpl ecl-type-traits"
SRC_URI = "https://github.com/yujinrobot-release/ecl_core-release/archive/release/bouncy/ecl_converters/1.0.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "03364dc9554216ab858f74c95ef34da9"
SRC_URI[sha256sum] = "afbd79e5e6b66aa1c4125c46a8b6c5b945fcbb121b37484d9cef931dc671b01b"
S = "${WORKDIR}/ecl_core-release-release-bouncy-ecl_converters-1.0.0-0"

inherit ros
inherit ament


