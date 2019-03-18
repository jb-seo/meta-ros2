# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "This package provides the c++ extensions for a variety of threaded      programming tools. These are usually different on different      platforms, so the architecture for a cross-platform framework      is also implemented."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "crystal"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = " ecl-build ecl-concepts ecl-config ecl-errors ecl-exceptions ecl-license ecl-time ecl-utilities"
SRC_URI = "https://github.com/yujinrobot-release/ecl_core-release/archive/release/crystal/ecl_threads/1.0.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "eb04746ed6761854eea1fcf5a4d50f5e"
SRC_URI[sha256sum] = "04e4e9d7cd8b64c1d3169d0f018f14ddde749db5fb7acccc0184371cee0bf078"
S = "${WORKDIR}/ecl_core-release-release-crystal-ecl_threads-1.0.1-0"

inherit ament
