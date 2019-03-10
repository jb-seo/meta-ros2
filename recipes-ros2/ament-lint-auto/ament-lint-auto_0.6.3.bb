# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The auto-magic functions for ease to use of the ament linters in CMake."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "crystal"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = "ament-cmake-core ament-cmake-test"
SRC_URI = "https://github.com/ros2-gbp/ament_lint-release/archive/release/crystal/ament_lint_auto/0.6.3-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "090e2b94f1234da4e805af764390fee9"
SRC_URI[sha256sum] = "b62354e1fd961347137dcba1a2edb17ad08b942795e2033f1cae1da8d050bde9"
S = "${WORKDIR}/ament_lint-release-release-crystal-ament_lint_auto-0.6.3-0"

inherit catkin
