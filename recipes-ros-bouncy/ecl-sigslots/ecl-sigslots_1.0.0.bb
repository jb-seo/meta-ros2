# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Provides a signal/slot mechanism (in the same vein as qt sigslots,      boost::signals etc for intra-process communication. These include      some improvements - they do not need a preprocessor, are fully type safe,      allow for simple connections via a posix style string identifier      and are multithread-safe."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "bouncy"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=13;endline=13;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "ecl-build ecl-config ecl-license ecl-threads"
SRC_URI = "https://github.com/yujinrobot-release/ecl_core-release/archive/release/bouncy/ecl_sigslots/1.0.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "73163037bfac25319db8d351616b7125"
SRC_URI[sha256sum] = "a64532c8182e1fe1a24c30b4cb5033436b3139b3dff68802da4125c5b9b72433"
S = "${WORKDIR}/ecl_core-release-release-bouncy-ecl_sigslots-1.0.0-0"


inherit ros
inherit ament

