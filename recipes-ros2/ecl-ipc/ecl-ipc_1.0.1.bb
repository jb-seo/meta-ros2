# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Interprocess mechanisms vary greatly across platforms - sysv, posix, win32, there   are more than a few. This package provides an infrastructure to allow for developing   cross platform c++ wrappers around the lower level c api's that handle these   mechanisms. These make it not only easier to utilise such mechanisms, but allow it   to be done consistently across platforms."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "crystal"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=13;endline=13;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = " ecl-build ecl-config ecl-errors ecl-exceptions ecl-license ecl-threads ecl-time ecl-time-lite"
SRC_URI = "https://github.com/yujinrobot-release/ecl_core-release/archive/release/crystal/ecl_ipc/1.0.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "56270f981d106a1e66ab4d7da15d6fbc"
SRC_URI[sha256sum] = "8b8c012ac5e1ad3893b3faa2985b7fe0c276271992adb1dbfc2f745a04e4063d"
S = "${WORKDIR}/ecl_core-release-release-crystal-ecl_ipc-1.0.1-0"

inherit ament
