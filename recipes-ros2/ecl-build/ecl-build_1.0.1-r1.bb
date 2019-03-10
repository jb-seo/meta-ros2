# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Collection of cmake/make build tools primarily for ecl development itself, but also      contains a few cmake modules useful outside of the ecl."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "crystal"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "ament-cmake ecl-license"
SRC_URI = "https://github.com/yujinrobot-release/ecl_tools-release/archive/release/crystal/ecl_build/1.0.1-1.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "86898ddaa83a14984471c38979a477c7"
SRC_URI[sha256sum] = "ab906dc70d7f2b7e3a145e192387984a328e0cea93c4cc28f73b6701c7a089d7"
S = "${WORKDIR}/ecl_tools-release-release-crystal-ecl_build-1.0.1-1"

inherit catkin
