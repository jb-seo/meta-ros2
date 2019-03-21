# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The auto-magic functions for ease to use of the ament linters in CMake."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "bouncy"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = "ament-cmake-core ament-cmake-test"
SRC_URI = "https://github.com/ros2-gbp/ament_lint-release/archive/release/bouncy/ament_lint_auto/0.5.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "83b2023a3bef7e27ef2ba65a49ee4fb8"
SRC_URI[sha256sum] = "d010726e2d3b7fc69af6e0c8c17bced5815abc0e83a8aca5092521d4747edd67"
S = "${WORKDIR}/ament_lint-release-release-bouncy-ament_lint_auto-0.5.2-0"

inherit ros
inherit ament


BBCLASSEXTEND += "native"