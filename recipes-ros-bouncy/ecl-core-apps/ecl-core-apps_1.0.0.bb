# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "This includes a suite of programs demo'ing various aspects of the      ecl_core. It also includes various benchmarking and utility programs for      use primarily with embedded systems."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "bouncy"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "ecl-build ecl-command-line ecl-config ecl-containers ecl-converters ecl-devices ecl-errors ecl-exceptions ecl-formatters ecl-geometry ecl-ipc ecl-license ecl-linear-algebra ecl-sigslots ecl-streams ecl-threads ecl-time-lite ecl-type-traits"
SRC_URI = "https://github.com/yujinrobot-release/ecl_core-release/archive/release/bouncy/ecl_core_apps/1.0.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "6323c781115062988d2f27a5c2618abc"
SRC_URI[sha256sum] = "f1fdaba0cc03ae4324bfabea9261b4c5940c09777ba5d2feda241f3925c6d8b6"
S = "${WORKDIR}/ecl_core-release-release-bouncy-ecl_core_apps-1.0.0-0"


inherit ros
inherit ament

