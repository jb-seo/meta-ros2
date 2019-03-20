# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Deploys various manipulation algorithms, currently just     feedforward filters (interpolations)."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "bouncy"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "ecl-build ecl-exceptions ecl-formatters ecl-geometry ecl-license"
SRC_URI = "https://github.com/yujinrobot-release/ecl_core-release/archive/release/bouncy/ecl_manipulators/1.0.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "9b872852c0b157127cab12c8066aef35"
SRC_URI[sha256sum] = "8fc8ea5e0275c84fae1b4d75cb4bdf588fd1b11a7d25d2c4aca23ee2501c3b77"
S = "${WORKDIR}/ecl_core-release-release-bouncy-ecl_manipulators-1.0.0-0"


inherit ros
inherit ament

