# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The CMake API for ament_flake8 to check code syntax and style conventions     with flake8."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "crystal"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = "ament-cmake-core ament-cmake-test"
SRC_URI = "https://github.com/ros2-gbp/ament_lint-release/archive/release/crystal/ament_cmake_flake8/0.6.3-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "354a3537304f294e4d2c5e568b083781"
SRC_URI[sha256sum] = "d0e88c23369996c1bd6a3507681da728516e32016f93d624da2ea3ba18165ba7"
S = "${WORKDIR}/ament_lint-release-release-crystal-ament_cmake_flake8-0.6.3-0"

inherit catkin
