# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The ability to check code against style conventions using uncrustify     and generate xUnit test result files."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "crystal"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = "uncrustify-vendor"
SRC_URI = "https://github.com/ros2-gbp/ament_lint-release/archive/release/crystal/ament_uncrustify/0.6.3-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "b8df2b99a58599efc597410dc88c078a"
SRC_URI[sha256sum] = "ea8315b08acfa2d52caf9bd164122a8bfedce9292a69b7b1a40a54a38470774c"
S = "${WORKDIR}/ament_lint-release-release-crystal-ament_uncrustify-0.6.3-0"

inherit catkin
