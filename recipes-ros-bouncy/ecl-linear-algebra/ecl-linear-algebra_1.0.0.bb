# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Ecl frontend to a linear matrix package (currently eigen)."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "bouncy"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "ecl-build ecl-converters ecl-eigen ecl-exceptions ecl-formatters ecl-license ecl-math sophus"
SRC_URI = "https://github.com/yujinrobot-release/ecl_core-release/archive/release/bouncy/ecl_linear_algebra/1.0.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "02044143bd8da90388f6cdcc90950535"
SRC_URI[sha256sum] = "86293e3305a44473f329f2d7b72bebad825ed12e8fbb7f65594de05ab676657e"
S = "${WORKDIR}/ecl_core-release-release-bouncy-ecl_linear_algebra-1.0.0-0"

inherit ros
inherit ament


