# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "CMake shim over the poco library."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "crystal"
LICENSE = "Apache-2.0 & Boost-1.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=401a7342a877608092ef332b6948eb03"

DEPENDS = "cmake poco pcre zlib"
SRC_URI = "https://github.com/ros2-gbp/poco_vendor-release/archive/release/crystal/poco_vendor/1.1.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "328dcc3560d8525766af8f4b6b847597"
SRC_URI[sha256sum] = "81e48bbd06ea2658b572efa9e854fb233b6e02f7559ef0ab27ff7d93da0a8e1b"
S = "${WORKDIR}/poco_vendor-release-release-crystal-poco_vendor-1.1.1-0"

inherit ament
