# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "This package provides the c++ extensions for a variety of threaded      programming tools. These are usually different on different      platforms, so the architecture for a cross-platform framework      is also implemented."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "bouncy"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "ecl-build ecl-concepts ecl-config ecl-errors ecl-exceptions ecl-license ecl-time ecl-utilities"
SRC_URI = "https://github.com/yujinrobot-release/ecl_core-release/archive/release/bouncy/ecl_threads/1.0.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "40cc36b400131c55290da8ca224667f9"
SRC_URI[sha256sum] = "0f4f44b3c8a8379ba08adc8dff39d810e9548b73c32e74ec97c0590d0b6c5c5e"
S = "${WORKDIR}/ecl_core-release-release-bouncy-ecl_threads-1.0.0-0"


inherit ros
inherit ament

