# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The CMake API for ament_flake8 to check code syntax and style conventions     with flake8."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "bouncy"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = "ament-cmake-core ament-cmake-test"
SRC_URI = "https://github.com/ros2-gbp/ament_lint-release/archive/release/bouncy/ament_cmake_flake8/0.5.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "eb3dcfefdc0aa0665b42098d93fd7d8b"
SRC_URI[sha256sum] = "2a3a3a1bb41239fcdf17c2f600957b3b71f6f7c731fd03b3181dc05eab0a8634"
S = "${WORKDIR}/ament_lint-release-release-bouncy-ament_cmake_flake8-0.5.2-0"

inherit ros
inherit cmake python3native


BBCLASSEXTEND += "native"