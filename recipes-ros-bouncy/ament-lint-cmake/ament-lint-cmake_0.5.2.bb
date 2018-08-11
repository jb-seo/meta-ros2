# Copyright 2018 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The ability to lint CMake code using cmakelint and generate xUnit test     result files."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "bouncy"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = ""
SRC_URI = "https://github.com/ros2-gbp/ament_lint-release/archive/release/bouncy/ament_lint_cmake/0.5.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "42a045a26b34e4e8b6f7eb0ead06e2a0"
SRC_URI[sha256sum] = "84639f2d3d620f15d7881ac57eefc0a16aae4ad5d93d1062bde483b770f79c7c"
S = "${WORKDIR}/ament_lint-release-release-bouncy-ament_lint_cmake-0.5.2-0"

inherit catkin
