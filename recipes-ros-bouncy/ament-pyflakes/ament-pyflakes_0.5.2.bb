# Copyright 2018 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The ability to check code using pyflakes and generate xUnit test     result files."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "bouncy"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = "pyflakes3"
SRC_URI = "https://github.com/ros2-gbp/ament_lint-release/archive/release/bouncy/ament_pyflakes/0.5.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "a83af62087fe57bf784a162982763927"
SRC_URI[sha256sum] = "88ae2b78794dbcbe8d6596e8c038a1221b88abb04d924054c65a568a47f56ad7"
S = "${WORKDIR}/ament_lint-release-release-bouncy-ament_pyflakes-0.5.2-0"

inherit catkin
