# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The CMake API for ament_xmllint to check XML file using xmmlint."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "crystal"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = "ament-cmake-core ament-cmake-test"
SRC_URI = "https://github.com/ros2-gbp/ament_lint-release/archive/release/crystal/ament_cmake_xmllint/0.6.3-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "f86dbc17ff68dda915efb3d99d47398c"
SRC_URI[sha256sum] = "86cd2c07fa56d815708aa74b8e7f4d42b0ebc4cfa5dfb05207be2ed7013e8d68"
S = "${WORKDIR}/ament_lint-release-release-crystal-ament_cmake_xmllint-0.6.3-0"

inherit catkin
