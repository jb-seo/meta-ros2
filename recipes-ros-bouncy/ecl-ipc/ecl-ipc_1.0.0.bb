# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Interprocess mechanisms vary greatly across platforms - sysv, posix, win32, there   are more than a few. This package provides an infrastructure to allow for developing   cross platform c++ wrappers around the lower level c api's that handle these   mechanisms. These make it not only easier to utilise such mechanisms, but allow it   to be done consistently across platforms."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "bouncy"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=13;endline=13;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "ecl-build ecl-config ecl-errors ecl-exceptions ecl-license ecl-threads ecl-time ecl-time-lite"
SRC_URI = "https://github.com/yujinrobot-release/ecl_core-release/archive/release/bouncy/ecl_ipc/1.0.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "83b725044ec4b516a7911e1031ca1928"
SRC_URI[sha256sum] = "e1d114b32bd5423d47f79fd38176186e83187b791590c7956e255ae200f4728f"
S = "${WORKDIR}/ecl_core-release-release-bouncy-ecl_ipc-1.0.0-0"


inherit ros
inherit ament

