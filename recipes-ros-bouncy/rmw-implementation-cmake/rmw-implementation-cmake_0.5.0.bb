# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "CMake functions which can discover and enumerate available implementations."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "bouncy"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = ""
SRC_URI = "https://github.com/ros2-gbp/rmw-release/archive/release/bouncy/rmw_implementation_cmake/0.5.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "9016adaa44a0429938c0614f99d3159c"
SRC_URI[sha256sum] = "09b0254962e8830e603158351d839392f9d8546c21365afc348b1e5d69be5e13"
S = "${WORKDIR}/rmw-release-release-bouncy-rmw_implementation_cmake-0.5.0-0"


inherit ros
inherit ament

