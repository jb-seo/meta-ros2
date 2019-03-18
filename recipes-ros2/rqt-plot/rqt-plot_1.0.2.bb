# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "rqt_plot provides a GUI plugin visualizing numeric values in a 2D plot using different plotting backends."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "crystal"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = " python3-matplotlib python3-numpy python-qt-binding qt-gui-py-common rclpy rqt-gui rqt-gui-py rqt-py-common std-msgs"
SRC_URI = "https://github.com/ros2-gbp/rqt_plot-release/archive/release/crystal/rqt_plot/1.0.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "f52cfc414de00d9ae8f7a30b2601f52f"
SRC_URI[sha256sum] = "748b63efccb0774caf53eb6b27c0ff0b818352f027bf34df203e4a7105aeeeef"
S = "${WORKDIR}/rqt_plot-release-release-crystal-rqt_plot-1.0.2-0"

inherit ament
