# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The ability to check code using pyflakes and generate xUnit test     result files."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "crystal"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = "pyflakes3"
SRC_URI = "https://github.com/ros2-gbp/ament_lint-release/archive/release/crystal/ament_pyflakes/0.6.3-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "3b9ed34158f66303911dd08e46d43948"
SRC_URI[sha256sum] = "928aab834a63a3fc15c7192bf93fc006f48692e467462af973b5f2f7552b0caf"
S = "${WORKDIR}/ament_lint-release-release-crystal-ament_pyflakes-0.6.3-0"

inherit catkin
