# Copyright 2018 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The ability to check code for style and syntax conventions with flake8."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "bouncy"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = "python3-flake8"
SRC_URI = "https://github.com/ros2-gbp/ament_lint-release/archive/release/bouncy/ament_flake8/0.5.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "3553651dd41c396aae3234ef548f231d"
SRC_URI[sha256sum] = "7bf28d079b6a1a74356326cff7a60b14e70280f1d0ba2e29ac3fcdf6fdeee5d8"
S = "${WORKDIR}/ament_lint-release-release-bouncy-ament_flake8-0.5.2-0"

inherit catkin
